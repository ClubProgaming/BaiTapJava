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
	@Override
	public boolean contains(CartPT that) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc, this.size);
	}
	@Override
	public double perimater() {
		// TODO Auto-generated method stub
		return this.size*4;
	}
}
