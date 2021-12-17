package ishape;

import junit.framework.TestCase;

public class dotTest extends TestCase {
	public void testContructor() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 new dot(pt1);
		 new dot(pt2);
	}
	public void testArea() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);

		 assertEquals(d1.area() , 0.0);
		 assertEquals(d2.area() , 0.0);
	}
	public void testDistantceToO() {
 		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);
		 
		 assertEquals(d1.distantceToO() ,  2.23,2);
		 assertEquals(d2.distantceToO() ,  5.0);
	}
	public void testContain() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);
		 
		 assertEquals(d1.contain(pt1) ,true);
		 assertEquals(d2.contain(pt1) , false);	 

	}
	public void testBoundingBox() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);	 
		 
		 assertEquals(d1.boundingBox() , new Square(new CartPT(1, 2), 0));
		 assertEquals(d2.boundingBox() , new Square(new CartPT(3, 4),0));
	}
}
