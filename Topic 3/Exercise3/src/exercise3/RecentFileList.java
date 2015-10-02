package exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/* Use TDD to create the 'Recent file list' behaviour. 
 * When the program is run for the first time, the list is empty.
 When a file is opened, it is added to the recent file list.
 If an opened file already exists in the recent file list, it 
 is bumped to the top, not duplicated in the list. 
 * If the recent file list gets full (typical number of items is 15),
 * the oldest item is removed when a new item is added.
 */
import java.util.Arrays;

public class RecentFileList {

	private File[] files;
	private File f;
	private int cont = 0;

	public RecentFileList() {
		files = new File[15];
	}

	public void openFile(String file) {
		// TODO Auto-generated method stub
		f = new File(file);
		String line;
		if (f.exists()) {

			putFile(f);

			BufferedReader buff = null;
			try {
				buff = new BufferedReader(new FileReader(f));
				
				while ((line = buff.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				System.err.println(e);
			} finally {

				try {
					buff.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("no existe el archivo");
		}
	}

	public int getCont() {
		return cont;
	}

	private void putFile(File f) {
		if (existFile(f) == true)
			putExistFile(f);
		else {
			if (cont == 15) {
				for (int i = 14; i > 0; i--) {
					files[i] = files[i - 1];
				}
				files[0] = f;
			} else
				files[cont++] = f;
		}
	}

	private boolean existFile(File file1) {
		boolean exist = false;
		for (File file2 : files) {
			if (file1.equals(file2)) {
				exist = true;
			}
		}
		return exist;
	}

	private void putExistFile(File file1) {
		int num = -1;
		for (File file2 : files) {
			num++;
			if (file1.equals(file2)) {

				for (int i = num; i > 0; i--) {
					files[i] = files[i - 1];
				}
				files[0] = file1;
			}
		}
	}

	private File[] getFiles() {
		return files;
	}

	public String showList() {
		// TODO Auto-generated method stub
		return Arrays.toString(getFiles());
	}

}
