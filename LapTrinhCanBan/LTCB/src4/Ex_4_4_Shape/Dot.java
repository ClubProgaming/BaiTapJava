package Ex_4_4_Shape;

import java.lang.reflect.Constructor;

public class Dot extends AShape {
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * Dot = New Dot(c1);
	 * @param loc
	 */
	public Dot(CartPT loc)
	{
		this.loc = loc;
	}
	public double area() {
		return 0.0;
	}
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * Dot d1 = New Dot(c1);
	 * c1.distansToO(); 2.34
	 */
	public double distantToO() {
		return this.loc.distantToO();
	}
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * Dot d1 = New Dot(c1);
	 * CartPT c2 = new CartPT(3,4);
	 * d1.contains(c1); true
	 * d1.contains(c2); false
	 */
	public boolean contains(CartPT that) {
		return this.loc.contains(that);
	}
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * Dot d1 = new Dot (c1);
	 * d1.boudingBox(); new Square(c1;0)
	 */
	public Square boudingBox() {
		return new Square(this.loc,0);
	}
	@Override
	/**
	 * CartPT c1 = new CartPT(1,2);
	 * Dot d1 = new Dot (c1);
	 * d1.perimater(); 0.0
	 */
	public double perimater() {
		return 0.0;
	}
}
