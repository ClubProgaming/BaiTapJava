package Ex_4_4_Shape;

public class Circle extends AShape  {
	private int radius;
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * IShape s1 = new Circle(c1,3.0);
	 * @param loc
	 * @param radius
	 */
	public Circle(CartPT loc , int radius) {
		this.loc = loc;
		this.radius = radius;
	}
	public double area() {
		return Math.PI *(this.radius*this.radius);
	}
	public double distantToO() {
		return this.loc.distantToO();
	}
	public boolean contains(CartPT that) {
		return this.loc.distantTo(that) < this.radius;
	}
	public Square boudingBox() {
		return new Square(this.loc.translate(this.radius, this.radius),this.radius*2);
	}
	@Override
	public double perimater() {
		// TODO Auto-generated method stub
		return this.radius*2*Math.PI;
	}
}
