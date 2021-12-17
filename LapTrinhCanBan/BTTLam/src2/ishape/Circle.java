package ishape;

public class Circle implements Ishape {
	private CartPT loc;
	private int radius;
	/**
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape c1 = new Circle(pt1,5);
	 I shape c2 = new Circle(pt2,4);
	 */
	public Circle(CartPT loc, int radius) {
		this.loc = loc;
		this.radius = radius;
	}
	/**
	 * for example area
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape c1 = new Circle(pt1,5);
	 I shape c2 = new Circle(pt2,4);
	
	 c1.area(c1) : 
	 c2.area(c2) :
	 */
	public double area() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*3.14;
	}
	
	/**
	 * for example distantceToO
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape c1 = new Circle(pt1,5);
	 I shape c2 = new Circle(pt2,4);
	 
	 c1.distantceToO() : 2.23,0.01
	 c2.distantceToO() ; 5
	 */
	
	public double distantceToO() {
		return this.loc.distantceToO();
	}
	/**
	 * for example contain
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 CartPT pt3 = new CartPT(7,9);
	 
	 I shape c1 = new Circle(pt1,5);
	 I shape c2 = new Circle(pt2,4);
	 
	 c1.contain(pt1) : true
	 c2.Contain(pt3) : false
	 */
	public boolean contain(CartPT that) {
		return this.loc.distantceTo(that) < this.radius;
	}
	
	@Override
	/**
     CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 CartPT pt3 = new CartPT(7,9);
	 
	 I shape c1 = new Circle(pt1,5);
	 I shape c2 = new Circle(pt2,4);
	 
	 c1.boundingBox() , new Square(new CartPT(-4,-3),10)
	 c2.boundingBox() , new Square(new CartPT(-1,0),8)
	 
	 */
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc.translate(this.radius, this.radius), this.radius*2);
	}
}
