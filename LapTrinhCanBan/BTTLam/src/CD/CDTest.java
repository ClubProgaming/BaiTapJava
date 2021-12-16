package CD;

import junit.framework.TestCase;

public class CDTest extends TestCase 
{
	public void testContructor() {
		new CD("CD",20);
	}
	public void testInterest() {
		
		CD v1 =	new CD("CD",20);
		assertEquals(v1.interest(), 0.4);	
	}
}
