package ZooAnimal;

import junit.framework.TestCase;

public class IZooAnimalTest extends TestCase {
	public void testConstructor() {
		 IZooAnimal l1 = new lion("lion1", 15.0, 10.0);
		 IZooAnimal l2 = new lion("lion2", 10.0, 7.0);
		 
		 IZooAnimal s1 = new snake("snake1",2.0,5.0);
		 IZooAnimal s2 = new snake("snake2",2.5,6.0);
		 
		 IZooAnimal m1 = new monkey("khi1",12.0,"banana");
		 IZooAnimal m2 = new monkey("khi2",13.0,"bananas");
	}
}
