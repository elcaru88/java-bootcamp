package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exc4Test {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		
		RomanConverter rc = new RomanConverter();
		rc.convert(5);
		rc.convert("VI");
	}

}
