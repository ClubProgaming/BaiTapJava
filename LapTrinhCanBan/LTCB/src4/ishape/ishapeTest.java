package ishape;

import junit.framework.TestCase;

public class ishapeTest extends TestCase {
	public void testContructor() {
		CartPT pt1 = new CartPT(1,2);
		CartPT pt2 = new CartPT(3,4);
		 
		new dot(pt1);
		new dot(pt2);
		 
		new Square(pt1,4);
		new Square(pt2,5);
		 
		new Circle(pt1,5);
		new Circle(pt2,6);
	}
	public void testArea() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);
		 assertEquals(d1.area() , 0.0);
		 assertEquals(d2.area() , 0.0);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 assertEquals(s1.area() , 16.0);
		 assertEquals(s2.area(), 25.0);
		 
		 Ishape c1 = new Circle(pt1,5);
		 Ishape c2 = new Circle(pt2,4);
		 assertEquals(c1.area(), 78.5);
		 assertEquals(c2.area(), 50.24);
	}
	public void testDistantceToO() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);
		 assertEquals(d1.distantceToO() ,  2.23,2);
		 assertEquals(d2.distantceToO() ,  5.0);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 assertEquals(s1.distantceToO() , 2.23,2);
		 assertEquals(s2.distantceToO() , 5.0);
		 
		 Ishape c1 = new Circle(pt1,5);
		 Ishape c2 = new Circle(pt2,4);
		 assertEquals(c1.distantceToO() , 2.23,2);
		 assertEquals(c2.distantceToO() , 5.0);
		
	}
	public void testContain() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 CartPT pt3 = new CartPT(7,9);		 
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);
		 assertEquals(d1.contain(pt1) ,true);
		 assertEquals(d2.contain(pt1) , false);	
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 assertEquals(s1.contain(pt2) , true);
		 assertEquals(s2.contain(new CartPT(22,17)) , false);

		 Ishape c1 = new Circle(pt1,5);
		 Ishape c2 = new Circle(pt2,4);
		 assertEquals(c1.contain(pt1) , true);
		 assertEquals(c2.contain(pt3) , false);
	}
	public void testBoundingBox() {
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Ishape d1 = new dot(pt1);
		 Ishape d2 = new dot(pt2);	 
		 assertEquals(d1.boundingBox() , new Square(new CartPT(1, 2), 0));
		 assertEquals(d2.boundingBox() , new Square(new CartPT(3, 4),0));
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 assertEquals(s1.boundingBox() , s1);
		 assertEquals(s2.boundingBox() , s2);
		 
		 Ishape c1 = new Circle(pt1,5);
		 Ishape c2 = new Circle(pt2,4);
		 assertEquals(c1.boundingBox() , new Square(new CartPT(-4,-3),10));
		 assertEquals(c2.boundingBox() , new Square(new CartPT(-1,0),8));
	}
}
