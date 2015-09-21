package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex2Test {

	@Test
	public void test() {
//		fail("Not yet implemented");
		WordWrapping wW = new WordWrapping(); 
		wW.algorithm("hola",10);
		wW.borrar ("ho", "hola");
		
	}
	
	

}
