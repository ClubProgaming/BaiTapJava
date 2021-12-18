/**
 * 
 */
package Ex_4_7_TaxiVehicle;

/**
 * @author lethanhtam
 *
 */
public class Van extends ATaxiVehicle{
	private boolean access;

	/**
	 * @param id
	 * @param passenger
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int id, int passenger, int pricePerMile, boolean access) {
		super(id, passenger, pricePerMile);
		this.access = access;
	}

	@Override
	public double fare(double numberOfMile) {
		// TODO Auto-generated method stub
		return this.fare(numberOfMile)*numberOfMile + this.passenger;
	}
	

}
