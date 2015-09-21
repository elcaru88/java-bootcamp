import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordsTest {

	@Test
	public void testFor0ToZero() {
		NumberToWords nw = new NumberToWords("0");
		String w=nw.ConvertAllToWords();
		assertEquals("zero dollars", w);
		
	}
	@Test
	public void test_0_and_FloatToWords() {
		assertEquals("zero and 4/100 dollars",new NumberToWords("0.04").ConvertAllToWords() );
	}
	
	@Test
	public void testFor10ToTen() {
		assertEquals("ten dollars",new NumberToWords("10").ConvertAllToWords() );
	}

	@Test
	public void testFor50ToFifty() {
		assertEquals("fifty dollars",new NumberToWords("50").ConvertAllToWords() );
	}

	@Test
	public void testFor100ToHundred() {
		assertEquals("one hundred dollars",new NumberToWords("100").ConvertAllToWords() );
	}
	
	@Test
	public void testFor1000ToThousand() {
		assertEquals("one thousand dollars",new NumberToWords("1000").ConvertAllToWords() );
	}
	
	@Test
	public void testFor1000000ToMillion() {
		assertEquals("one million dollars",new NumberToWords("1000000").ConvertAllToWords() );
	}
	
	@Test
	public void testFor1000000ToMillionThousand() {
		assertEquals("one million, one thousand dollars",new NumberToWords("1001000").ConvertAllToWords() );
	}
	
	@Test
	public void testFor1000000ToBillion() {
		assertEquals("one billion dollars",new NumberToWords("1000000000").ConvertAllToWords() );
	}

}
