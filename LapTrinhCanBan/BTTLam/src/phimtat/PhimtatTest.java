package phimtat;


import junit.framework.TestCase;

public class PhimtatTest extends TestCase {
	public void testContructor() {
		new pimtat(12, "data");
	}

	public void testss1() {
		pimtat s = new pimtat(12, "data");
		assertEquals(s.ss1(), 24);
	}

	
}
