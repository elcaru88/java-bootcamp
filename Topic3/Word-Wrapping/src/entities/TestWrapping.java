package entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWrapping {

	@Test
	public void test1() {
		
		Wrapping w = new Wrapping();
		assertEquals( w.splitEqually("hello", 3).toString() , "[hel, lo]" );
	}
	
	@Test
	public void test2() {
		
		Wrapping w = new Wrapping();
		assertEquals( w.splitEqually("Excelent", 5).toString() , "[Excel, ent]" );
	}
	
	@Test
	public void test3() {
		
		Wrapping w = new Wrapping();
		assertEquals( w.splitEqually("ExcelentExcelentExcelentExcelent", 50).toString()  , "[ExcelentExcelentExcelentExcelent]");
	}
	
	
	

}
