package ishape;

import junit.framework.TestCase;

public class CartPTTest extends TestCase {
	public void testContructor() {
		
	 new CartPT(1,2);
	 new CartPT(3,4);
	}
	public void testDistantceToO() {
		CartPT pt1 = new CartPT(1,2);
		CartPT pt2 = new CartPT(3,4);
		
		assertEquals(pt1.distantceToO() , 2.23,2);
		assertEquals(pt2.distantceToO() , 5.0);
	}
	public void testDistantceTO() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 assertEquals(pt1.distantceTo(pt2) , 2.83,2);
	}
	public void testTranslate() {
		CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 assertEquals(pt1.translate(1,2) , new CartPT(0,0));
		 assertEquals(pt2.translate(1,2) , new CartPT(2,2));
	}
}
