package Ex_4_4_Shape;

public class CartPT {
	private int x;
	private int y;
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * CartPT c2 = new CartPT(3,4);
	 * @param x
	 * @param y
	 */
	public CartPT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distantToO() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public boolean contains(CartPT that) {
		// TODO Auto-generated method stub
		return this.x==that.x && this.y==that.y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double distantTo(CartPT that) {
		return Math.sqrt((this.x-that.x)*(this.x-that.x)-(this.y-that.y)*(this.y-that.y));
	}
	public CartPT translate(int dx,int dy) {
		return new CartPT(this.x-dx,this.y-dy);
	}
 }
