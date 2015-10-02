package words;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWords {

	@Test
	public void testHello() {
		WordWrapping ww = new WordWrapping();
		
		assertEquals("[Hello , word!]", ww.algorithm3("Hello word!", 6).toString());
	}
	
	@Test
	public void testAbc() {
		WordWrapping ww = new WordWrapping();
		
		assertEquals("[a b, c d, e f, ]", ww.algorithm3("a b c d e f", 3).toString());
	}
	
	@Test
	public void testExc() {
		WordWrapping ww = new WordWrapping();
		
		assertEquals("[Excel, ent]", ww.algorithm3("Excelent", 5).toString());
	}

}
