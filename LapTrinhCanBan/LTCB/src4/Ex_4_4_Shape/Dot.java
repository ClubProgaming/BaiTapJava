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
	public double distantToO() {
		return this.loc.distantToO();
	}
}
