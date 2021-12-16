package ZooAnimal;

public class snake implements IZooAnimal {
	private String name;
	private double wight;
	private double lenght;
	/**
	 * for example Constructor 
	 IZooAnimal s1 = new snake("snake1",2.0,5.0);
	 IZooAnimal s2 = new snake("snake2",2.5,6.0);
	 * @param name
	 * @param wight
	 * @param lenght
	 */
	public snake(String name, double wight, double lenght) {
		this.name = name;
		this.wight = wight;
		this.lenght = lenght;
	}
	
}
