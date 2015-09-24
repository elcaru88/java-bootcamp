package romanConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {
	
	// INTEGER TO ROMAN 
	
	@Test
	public void convertToRoman_3_to_III() {
		
		Roman roman = new Roman((new MyNumber(3).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "III");
	}
	
	@Test
	public void convertToRoman_1_to_I() {
		
		Roman roman = new Roman((new MyNumber(1).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "I");
	}
	
	@Test
	public void convertToRoman_5_to_V() {
		
		Roman roman = new Roman((new MyNumber(5).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "V");
	}
	
	@Test
	public void convertToRoman_10_to_X() {
		
		Roman roman = new Roman((new MyNumber(10).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "X");
	}
	
	@Test
	public void convertToRoman_100_to_C() {
		
		Roman roman = new Roman((new MyNumber(100).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "C");
	}
	
	@Test
	public void convertToRoman_111_to_CXI() {
		
		Roman roman = new Roman((new MyNumber(111).intToRomanNumerals()));
		assertEquals(  roman.getRomanDigit() , "CXI");
	}
	
	//  ROMAN TO INTEGER  //
	
	@Test
	public void convertToInteger_C_to_100() {
		
		MyNumber myNumber = new MyNumber(new Roman("C").romanToDecimal());
		assertEquals( myNumber.getNumber() , 100);
	}
	
	@Test
	public void convertToInteger_M_to_1000() {
		
		MyNumber myNumber = new MyNumber(new Roman("M").romanToDecimal());
		assertEquals( myNumber.getNumber() , 1000);
	}
	
	@Test
	public void convertToInteger_MCI_to_1101() {
		
		MyNumber myNumber = new MyNumber(new Roman("MCI").romanToDecimal());
		assertEquals( myNumber.getNumber() , 1101);
	}
}
