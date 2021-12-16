package Restaurant;

public class Restaurant
{
	String name;
	String food;
	String priceRange;
	intersection intersection;
	
	Restaurant(String name, String food, String priceRange, intersection intersection)
	{
		this.food = food;
		this.name = name;
		this.intersection = intersection;
		this.priceRange = priceRange;
	}
}
