package ishape;

import junit.framework.TestCase;

public class SquareTest extends TestCase {
	public void testContructor() {
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 new Square(pt1,4);
	 new Square(pt2,5);

	}
	public void testArea() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 
		 assertEquals(s1.area() , 16.0);
		 assertEquals(s2.area(), 25.0);
	}
	public void testDistantceToO() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 
		 assertEquals(s1.distantceToO() , 2.23,2);
		 assertEquals(s2.distantceToO() , 5.0);

	}
//	public void testBetween() {
//		
//		 CartPT pt1 = new CartPT(1,2);
//		 CartPT pt2 = new CartPT(3,4);
//		 
//		 Square s1 = new Square(pt1,4);
//		 Square s2 = new Square(pt2,5);
//		 
//		 assertEquals(between(13,12,15), true);
//		 assertEquals(between(13,24,25), false)
//
//	}
	public void testContain() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 
		 assertEquals(s1.contain(pt2) , true);
		 assertEquals(s2.contain(new CartPT(22,17)) , false);
	}
	public void testBoundingBox() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 
		 assertEquals(s1.boundingBox() , s1);
		 assertEquals(s2.boundingBox() , s2);

	}
}
