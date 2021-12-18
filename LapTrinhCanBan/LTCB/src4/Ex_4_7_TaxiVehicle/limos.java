/**
 * 
 */
package Ex_4_7_TaxiVehicle;

/**
 * @author lethanhtam
 *
 */
public class limos extends ATaxiVehicle{
	private int minRantal;

	/**
	 * @param id
	 * @param passenger
	 * @param pricePerMile
	 * @param minRantal
	 */
	public limos(int id, int passenger, int pricePerMile, int minRantal) {
		super(id, passenger, pricePerMile);
		this.minRantal = minRantal;
	}

	@Override
	public double fare(double numberOfMile) {
		// TODO Auto-generated method stub
		return this.fare(numberOfMile)*numberOfMile;
	}
	
}
