package Ex_4_4_Shape;

public interface IShape {
	public double area();
	public double distantToO();
	public double contains(CartPT that);
	public Square boudingBox();
	public double perimater();
}
