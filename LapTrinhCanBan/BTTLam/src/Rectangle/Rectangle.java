package Rectangle;

/**
 * rectangle : hinh chu nhat
 * 
 * @author lethanhtam
 *
 */
public class Rectangle {
	private CartPt location;
	private int wight;
	private int height;

	/**
	 * @return the location
	 */
	public CartPt getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(CartPt location) {
		this.location = location;
	}

	/**
	 * @return the wight
	 */
	public int getWight() {
		return wight;
	}

	/**
	 * @param wight the wight to set
	 */
	public void setWight(int wight) {
		this.wight = wight;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	Rectangle(CartPt location, int wight, int height) {
		this.height = height;
		this.location = location;
		this.wight = wight;
	}

	/**
	 * distance rectangle to O(0,0)
	 */
	public double ditancetoO() {
		return this.location.distancetoO();

	}

	/**
	 * distance min center rectangle to O(0,0)
	 */
	public double DistanCecenterRestangleToO(Rectangle that) {
		return this.location.DistanCecenterRestangleToO(that);
	}

}
