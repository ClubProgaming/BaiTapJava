package ishape;

public class CartPT {
	private int x;
	private int y;
	/*
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt1 = new CartPT(3,4);
	 */
	public CartPT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	/**
	 * for example distantceToO
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt1 = new CartPT(3,4);
	 
	 pt1.distantceToO() : 2.23,0.01
	 pt2.distantceToO() : 5
	 * @return
	 */
	public double distantceToO() {
		return Math.sqrt(this.x*this.x+ this.y*this.y);
	}
	/**
	 * for example distantceTO
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt1 = new CartPT(3,4);
	 
	 pt1.distantceTo(pt2) : 2.83,0.01
	  
	 * @param that
	 * @return
	 */
	public double distantceTo(CartPT that ) {
		return Math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y));
	}
	/**
	 * for example translate
	 CartPT pt1 = new CartPT(1,2);
	 CartPT pt2 = new CartPT(3,4);
	 
	 pt1.translate(1,2) : new CartPT(0,0)
	 pt2.translate(1,2) : new CartPT(2,2)
	 * @param dx
	 * @param dy
	 * @return
	 */
	public CartPT translate(int dx,int dy) {
		return new CartPT(this.x-dx,this.y-dy);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof CartPT)) {
			return false;
		}else {
			CartPT that = (CartPT) obj;
			return (this.x == that.x) && ( this.y == that.y);
		}
	}
	
	
}
