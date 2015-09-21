package NumberToString;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToStringTest {

	
	@Test
	public void testForconvert_0_to_cero(){
		
		assertEquals ( new NumberWords((float) 0.0).compile() , " and 0/10");
		// should reteturn  cero  
	}
	
	@Test
	public void testForconvert_0dot1_to_ceroAndOne(){
		
		assertEquals ( new NumberWords((float) 0.1).compile() , " and 1/10");
		// should devolver 1/10
	}
	
	@Test
	public void testForconvert_1dot1_to_OneAndCents(){
		
		assertEquals ( new NumberWords((float) 1.1).compile() , "one and 1/10");
	
	}
	
	@Test
	public void testForConvert_1_to_one() {
		
		assertEquals( new NumberWords(1).compile() , "one and 0/10");
	}
	
	@Test
	public void testForConvert_2_to_two() {
		
		assertEquals(  new NumberWords(2).compile() , "two and 0/10");
	}
	
	@Test
	public void testForConvert_10_to_ten() {
		
		assertEquals(    new NumberWords(10).compile() , "ten and 0/10");
	}
	
	@Test
	public void testForConvert_100_to_Hundred() {
		
		assertEquals(    new NumberWords(100).compile() , "one hundred and 0/10");
	}
	
	@Test
	public void testForConvert_1000_to_Thousen() {
		
		assertEquals(  new NumberWords(1000).compile() , "one thousand and 0/10");
	}
	
	@Test
	public void testForConvert_1100_to_ThousanAndHundred() {
		
		assertEquals(  new NumberWords(1100).compile() , "one thousand, one hundred and 0/10");
	}
	
	@Test
	public void testForConvert_11000_to_elevenHousand() {
		
		assertEquals(  new NumberWords(11000).compile() , "eleven thousand and 0/10");
	}

}
