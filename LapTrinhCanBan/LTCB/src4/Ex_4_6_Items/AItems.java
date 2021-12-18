package Ex_4_6_Items;

public abstract class AItems {
	private String name;
	private double weight;
	private int price;
	/**
	 * @param name
	 * @param weight
	 * @param price
	 */
	public AItems(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	/*-double unitprice
	-boolead lowprice
	-boolead cheaperThan
	*/
	public double unitprice() {
		return 0.0;
	}
	public boolean lowprice() {
		return true;
	}
	public boolean cheaperThan() {
		return true;
	}
}
