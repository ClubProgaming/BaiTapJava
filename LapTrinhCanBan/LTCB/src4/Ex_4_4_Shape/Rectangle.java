package Ex_4_4_Shape;

public class Rectangle extends AShape{
	private int hight;
	private int width;
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * IShape s4 = new Rectangle(c1,10,20)
	 * @param loc
	 * @param hight
	 * @param width
	 */
	public Rectangle(CartPT loc,int hight, int width) {
		this.loc = loc;
		this.hight = hight;
		this.width = width;
	}
	public double area() {
		return this.hight*this.width;
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
		return new Square (this.loc,this.width);
	}
	@Override
	public double perimater() {
		// TODO Auto-generated method stub
		return this.hight+this.width;
	}
	
}
