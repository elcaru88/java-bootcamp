package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exc4Test {

	private RomanConverter rc = new RomanConverter();
	
	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	// test convert string to int
	@Test
	public void testConvertString() {

		assertEquals("IV", rc.convert(4));
	}

	// test convert int to string
	@Test
	public void testConvertInt() {

		assertEquals(5, rc.convert("V"));
	}

	@Test
	public void testDecimalToText() {

		assertEquals(5, rc.convert("V"));
	}

	@Test
	public void testTenToString() {

		assertEquals("XX", rc.tenToString(20));
	}

	@Test
	public void testHundredToString() {

		assertEquals("D", rc.convert(500));
	}

	@Test
	public void testThousandthToString() {

		assertEquals("MM", rc.convert(2000));
	}

}
