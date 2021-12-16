package ishape;

public class Square implements Ishape {

	private CartPT loc;
	private int size;
	/**
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 Square s1 = new Square(pt1,4);
	 Square s2 = new Square(pt2,5);
	 
	 * @param loc
	 * @param radius
	 */
	public Square(CartPT loc, int size) {
		this.loc = loc;
		this.size = size;
	}

	@Override
	/**
	 * for example area
		 CartPT pt1 = new CartPT(1,2);
		 CartPT pt2 = new CartPT(3,4);
		 
		 Square s1 = new Square(pt1,4);
		 Square s2 = new Square(pt2,5);
		 
		 assertEquals(s1.area() , 16.0);
		 assertEquals(s2.area(), 25.0);	 */
	public double area() {
		return this.size *this.size;
	}
	/**
	 * for example distantceToO
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 Square s1 = new Square(pt1,4);
	 Square s2 = new Square(pt2,5);
	 
	 s1.distantcetoO() : 2.23,0.01
	 s2.distantceToO() : 5
	 
	 */
	public double distantceToO() {
		return this.loc.distantceToO();
	}
	/**
	 * for example between
	 
	 between(13,12,15), true
	 between(13,24,25), false
	 * @param value
	 * @param low
	 * @param high
	 * @return
	 */
	private boolean between(int value, int low,int high) {
		return (low <= value)&&(high >= value);
	}
	/**
	 * for example contain
	 
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 Square s1 = new Square(pt1,4);
	 Square s2 = new Square(pt2,5);
	 
	 s1.contain(pt2) , true
	 s2.contain(new CartPT(22,17)) , false
	 */
	public boolean contain(CartPT that) {
		return this.between(that.getX(),this.loc.getX(),this.loc.getX()+this.size)
				&&this.between(that.getY(), this.loc.getY(), this.loc.getY()+this.size);
	}

	@Override
	/**
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 Square s1 = new Square(pt1,4);
	 Square s2 = new Square(pt2,5);
	 
	 s1.boundingBox() , s1
	 s2.boundingBox() , s2
	 
	 */
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc, this.size);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(null==obj || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return (this.loc.equals(that.loc)&&this.size == that.size);
				}
	}
}

