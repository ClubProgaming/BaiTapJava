package ishape;

public class dot implements Ishape {
	private CartPT loc;
	/**
	 * for example contructor
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape d1 = new dot(pt1);
	 I shape d2 = new dot(pt2);
	 * @param loc
	 */
	public dot(CartPT loc) {
		this.loc = loc;
	}
	/**
	 * for example area
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape d1 = new dot(pt1);
	 I shape d2 = new dot(pt2);

	 d1.area() : 0
	 d2.area() : 0
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	/**
	 * 	for example distantceToO
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape d1 = new dot(pt1);
	 I shape d2 = new dot(pt2);
	 
	 d1.distantceToO() :  2.23,0.01
	 d2.distantceToO() :  5
	 
	 */
	public double distantceToO() {
		return this.loc.distantceToO();
	}
	/**
	 * for example contain
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape d1 = new dot(pt1);
	 I shape d2 = new dot(pt2);
	 
	 d1.contain(pt1) : true
	 d2.contain(pt1) : false	 
	 * @param that
	 * @return
	 */
	public boolean contain(CartPT that) {
		return this.loc.distantceTo(that) == 0.0 ;
	}
	@Override
	/**
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 I shape d1 = new dot(pt1);
	 I shape d2 = new dot(pt2);	 
	 
	 d1.boundingBox() , new Square(pt1),0);
	 d2.boundingBox() , new Square(pt2),0);
	 
	 */
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc,0);
	}
}
