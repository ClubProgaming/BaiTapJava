package Ex_4_7_TaxiVehicle;

public abstract class ATaxiVehicle {
	protected int id;
	protected int passenger;
	protected int pricePerMile;
	/**
	 * Testing Constructer
	 
	 * @param id 
	 * @param passenger
	 * @param pricePerMile
	 */
	public ATaxiVehicle(int id, int passenger, int pricePerMile) {
		this.id = id;
		this.passenger = passenger;
		this.pricePerMile = pricePerMile;
	}
	/**
	 * Testing fare()
	 
	 * @param numberOfMile
	 * @return
	 */
	public abstract double fare(double numberOfMile); 
	/**
	 * Testing lowerPrice
	 
	 * @param numberOfMile
	 * @param mount
	 * @return
	 */
	public boolean lowerPrice(double numberOfMile,double mount)
	{
		return this.fare(numberOfMile) > mount;
	}
	/**
	 * Testing cheaperThan()
	 
	 * @param numberOfMile
	 * @param that
	 * @return
	 */
	public boolean cheaperThan(double numberOfMile,ATaxiVehicle that) {
		return this.fare(numberOfMile) > that.fare(numberOfMile);
	}
}
