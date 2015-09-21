package exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exc3Test {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		RecentFileList rfl = new RecentFileList();
		rfl.showList();
		rfl.openFile("archivo.txt");
		
	}

}
