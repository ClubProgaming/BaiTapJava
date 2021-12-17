package ishape;

import junit.framework.TestCase;
/**
 * Testing for circle
 * @author lethanhtam
 *
 */
public class CircleTest extends TestCase {
	/**
	 *Testing for constructor 
	 */
	public void testContructor() {
	CartPT pt1 = new CartPT(1,2);
	CartPT pt2 = new CartPT(3,4);
	 
	new Circle(pt1,5);
	new Circle(pt2,6);
	}
	public void testArea() {
	CartPT pt1 = new CartPT(1,2);
	CartPT pt2 = new CartPT(3,4);
	 
	Ishape c1 = new Circle(pt1,5);
	Ishape c2 = new Circle(pt2,4);
	
	assertEquals(c1.area(), 78.5);
	assertEquals(c2.area(), 50.24);
	}
	public void testDistantToO() {
	CartPT pt1 = new CartPT(1,2);
	CartPT pt2 = new CartPT(3,4);
	 
	Ishape c1 = new Circle(pt1,5);
	Ishape c2 = new Circle(pt2,4);
	
	assertEquals(c1.distantceToO() , 2.23,2);
	assertEquals(c2.distantceToO() , 5.0);
	}
	public void testContain() {
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 CartPT pt3 = new CartPT(7,9);
	 
	 Ishape c1 = new Circle(pt1,5);
	 Ishape c2 = new Circle(pt2,4);
	 
	 assertEquals(c1.contain(pt1) , true);
	 assertEquals(c2.contain(pt3) , false);
	}
	public void testBoundingBox() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape c1 = new Circle(pt1,5);
		 Ishape c2 = new Circle(pt2,4);
		 
		 assertEquals(c1.boundingBox() , new Square(new CartPT(-4,-3),10));
		 assertEquals(c2.boundingBox() , new Square(new CartPT(-1,0),8));
	}

}
