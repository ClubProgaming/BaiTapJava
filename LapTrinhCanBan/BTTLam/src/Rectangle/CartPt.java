package Rectangle;

public class CartPt {
	private int x;
	private int y;

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * min distance rectangle to O(0,0)
	 * 
	 * @return
	 */
	public double distancetoO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	public double DistanCecenterRestangleToO(Rectangle that) {
		return Math.sqrt((this.x+(that.getWight()/2))*(this.x+(that.getWight()/2))+
				(this.y+(that.getHeight()/2))*(this.y+(that.getHeight()/2)));
	}
}
