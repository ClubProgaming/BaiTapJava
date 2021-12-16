package ZooAnimal;

public class monkey implements IZooAnimal {
	private String name;
	private double wight;
	private String food;
	/**
	 * for example constructor
	 IZooAnimal m1 = new monkey("khi1",12.0,"banana");
	 IZooAnimal m2 = new monkey("khi2",13.0,"bananas");
	 * @param name
	 * @param wight
	 * @param food
	 */
	public monkey(String name, double wight, String food) {
		this.name = name;
		this.wight = wight;
		this.food = food;
	}
	
}
