package Ex_4_7_TaxiVehicle;

public abstract class ATaxiVehicle {
	protected int id;
	protected int passenger;
	protected int pricePerMile;
	/*
	 * 	+Double    fare(double    numberOfMile)
 		+boolean    lowerPrice(double    numberOfMile; doouble     amount)
		+boolean    cheaperThen(double    numberOfMile; ATaxiVehicle that)

	 */
	/**
	 * @param id
	 * @param passenger
	 * @param pricePerMile
	 */
	public ATaxiVehicle(int id, int passenger, int pricePerMile) {
		super();
		this.id = id;
		this.passenger = passenger;
		this.pricePerMile = pricePerMile;
	}
	public abstract double fare(double numberOfMile);
	public boolean lowerPrice(double numberOfMile,double mount)
	{
		return this.fare(numberOfMile) > mount;
	}
	public boolean cheaperThan(double numberOfMile,ATaxiVehicle that) {
		return this.fare(numberOfMile) > that.fare(numberOfMile);
	}
}
