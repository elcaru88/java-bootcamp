package exercise1;


import static org.junit.Assert.*;


public class Test {

	
	private Converter con = new Converter();
	
	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void testDecimalToText() {
		assertEquals("one", con.decimalToText(1));
	}

	@org.junit.Test
	public void testCompositeNumber() {
		assertEquals("twenty-five", con.compositeNumber(25));
	}
	
	@org.junit.Test
	public void testGetText() {
		con.setNumber(25500.0);
		assertEquals("twenty-five thousand five hundred  and 00/100 dollars", con.getText());
	}



}
