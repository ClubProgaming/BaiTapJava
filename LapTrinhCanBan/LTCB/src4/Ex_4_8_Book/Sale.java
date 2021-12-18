/**
 * 
 */
package Ex_4_8_Book;

/**
 * @author lethanhtam
 *
 */
public class Sale extends ABook {

	public Sale(String title, String author, double price, int publicionYear) {
		super(title, author, price, publicionYear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.price*0.5;
	}

}
