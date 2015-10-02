package exercise3;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class Exc3Test {
	private RecentFileList rfl = new RecentFileList();
	private File file = new File("I:/archivos/1.txt");

	@Test
	public void test() {
		// fail("Not yet implemented");

		// rfl.showList();
		// rfl.openFile("archivo.txt");
	}

	// comprobar
	@Test
	public void testOpenFile() {
		// assertEquals("hola", rfl.openFile("I:/archivos/1.txt"));
	}

	@Test
	public void testGetCont() {
		rfl.openFile("I:/archivos/1.txt");
		assertEquals(1, rfl.getCont());

	}

	@Test
	public void testShowList() {
		rfl.openFile("I:/archivos/1.txt");
		assertEquals(
				"[I:\\archivos\\1.txt, null, null, null, null, null, null, null, null, null, null, null, null, null, null]",
				rfl.showList());
	}

}
