/**
 * 
 */
package Ex_4_5_AGallery;

/**
 * @author lethanhtam
 *
 */
public abstract class AAGallery   {
	protected String name;
	protected int size;	
	/**
	 * Testing timeToDownLoad(double networkSpeed)
	 * 
	 * @param networkSpeed
	 * @return
	 */
	public double timeToDownLoad(double networkSpeed) {
		return this.size / networkSpeed;
	}
	/**
	 * Testing smallSize(int maximumSize)
	 * 
	 * @param maximumSize
	 * @return
	 */
	public boolean smallThan(int maximumSize) {
		return this.size < maximumSize;
	}
	/**
	 * Testing sameName(Sting givenName)
	 * 
	 * @param givenname
	 * @return
	 */
	public  boolean sameName(String givenName)
	{
		return this.name.equals(givenName);
	}
	

}
