package ZooAnimal;

import junit.framework.TestCase;

public class lionTest extends TestCase {
	public void testConstructor() {
		 IZooAnimal l1 = new lion("lion1", 15.0, 10.0);
		 IZooAnimal l2 = new lion("lion2", 10.0, 7.0);
	}
}
