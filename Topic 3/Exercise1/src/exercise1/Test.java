package exercise1;


import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		Converter con = new Converter();
		con.setNumber(120.00);
		con.getText();
		con.decimalToText(1);
		con.compositeNumber(25);
		
	}

}
