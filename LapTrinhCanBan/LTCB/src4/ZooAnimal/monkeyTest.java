package ZooAnimal;

import junit.framework.TestCase;

public class monkeyTest extends TestCase {
	public void testConstructor() {
		 IZooAnimal m1 = new monkey("khi1",12.0,"banana");
		 IZooAnimal m2 = new monkey("khi2",13.0,"bananas");
	}
}
