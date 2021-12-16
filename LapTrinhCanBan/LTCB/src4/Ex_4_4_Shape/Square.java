package Ex_4_4_Shape;

public class Square extends AShape {
	private int size;
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * IShape s2 = new Square(c1,5);
	 * @param loc
	 * @param size
	 */
	public Square(CartPT loc,int size) {
		this.loc = loc;
		this.size = size;
	}
	/**
	 *CartPT c1 = new CartPT(1,2);
	 * IShape s2 = new Square(c1,5);
	 */
	public double area() {
		return this.size*this.size;
	}
	public double distantToO() {
		return this.loc.distantToO();
	}
}
