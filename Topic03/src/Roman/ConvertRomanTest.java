package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertRomanTest {

	@Test
	public void testRomanToInt() {
		ConvertRoman cr = new ConvertRoman();
		String rom= cr.convertToRoman(100);
		assertEquals("C", rom);
	}
	
	@Test
	public void testMCCCLToINt() {
		assertEquals("MCCCL",new ConvertRoman().convertToRoman(1350));
	}
	//Int To Roman
	@Test
	public void testIntToRoman() {
		ConvertRoman cr = new ConvertRoman();
		int integer= cr.convertRomanToInt("D");
		assertEquals(500, integer);
	}
	
	@Test
	public void testThousandToRoman() {
		assertEquals(1000,new ConvertRoman().convertRomanToInt("M"));
	}

}
