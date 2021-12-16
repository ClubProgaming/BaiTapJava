package Rectangle;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
	public void testCartPtContructor() {
		new CartPt(8, 8);
	}

	public void testRectanglecontructor() {
		new Rectangle(new CartPt(9, 9), 7, 8);
	}
	
	/**
	 * distance center rectangle to O(0,0)
	 */
	public void testDistancetoO() {
		Rectangle v1 = new Rectangle(new CartPt(2, 2), 10, 10);
		assertEquals(v1.ditancetoO(), 2.8284,0.0001);
	}
}
