/**
 * 
 */
package Ex_4_8_Book;

/**
 * @author lethanhtam
 *
 */
public abstract class ABook {
	protected String title;
	protected String author;
	protected  double price;
	protected  int publicionYear;
	/**
	 * @param title
	 * @param author
	 * @param price
	 * @param publicionYear
	 */
	public ABook(String title, String author, double price, int publicionYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicionYear = publicionYear;
	}
	public abstract double salePrice();
	public boolean CheaperThen(ABook that) {
		return this.salePrice() > that.salePrice();
	}
	public boolean sameAthor(ABook that) {
		return this.author.equals(that.author);
	}
}
