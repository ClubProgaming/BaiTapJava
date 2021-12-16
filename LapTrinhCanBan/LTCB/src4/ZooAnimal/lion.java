package ZooAnimal;

public class lion implements IZooAnimal {
	private String name;
	private double wight;
	private	double meat;
	/**
	 * for example constructor
	 IZooAnimal l1 = new lion("lion1", 15.0, 10.0);
	 IZooAnimal l2 = new lion("lion2", 10.0, 7.0);
	 * @param name
	 * @param wight
	 * @param meat
	 */
	public lion(String name, double wight, double meat) {
		this.name = name;
		this.wight = wight;
		this.meat = meat;
	}
	
}
