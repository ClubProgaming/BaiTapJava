package ZooAnimal;

import junit.framework.TestCase;

public class snakeTest extends TestCase {
	public void testConstructor() {
		 IZooAnimal s1 = new snake("snake1",2.0,5.0);
		 IZooAnimal s2 = new snake("snake2",2.5,6.0);
	}
}
