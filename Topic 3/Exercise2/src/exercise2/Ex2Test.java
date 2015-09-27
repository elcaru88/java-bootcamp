package exercise2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Ex2Test {

	private WordWrapping wW = new WordWrapping();

	private ArrayList<String> exelent =new ArrayList<String>();
	
	
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		wW.algorithm("hola",10);
			
	}
	
	@Test
	// Delete first string of second string
	public void testDelete() {
		assertEquals("la",wW.delete("ho", "hola"));
	}

	@Test
	
	public void testAlgorithm() {
		exelent.add("excel");
		exelent.add("ente");
		assertEquals(exelent, wW.algorithm("excelente", 5));
		//("[excel, ente]", wW.algorithm("excelente", 5));
	}

	

}
