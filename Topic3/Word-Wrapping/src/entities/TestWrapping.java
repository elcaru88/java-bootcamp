package entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWrapping {

	@Test
	public void test() {
		
		Wrapping w = new Wrapping();
		assertEquals( w.splitEqually("hello", 3 ) , "[hel, lo]" );
	}
	
	

}
