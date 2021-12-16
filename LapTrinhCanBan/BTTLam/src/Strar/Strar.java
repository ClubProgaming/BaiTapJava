/**
 * 
 */
package Strar;

/**
 * @author lethanhtam
 *
 */
public class Strar 
{
	private String firstname;
	private String lastname;
	private String instrument;
	private int sales;
	/**
	 * @param firstname
	 * @param lastname
	 * @param instrument
	 * @param sales
	 */
	public Strar(String firstname, String lastname, String instrument, int sales) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.instrument = instrument;
		this.sales = sales;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	
	
	
}
