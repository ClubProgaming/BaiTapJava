package Restaurant;
import junit.framework.TestCase;

public class RestaurantTest extends TestCase
{
	public void testIntersectionConstructor()
	{
		new intersection(12,13);
	}
	public void testRestaurant()
	{
		new Restaurant("La Crepe", "French", "moderate",new intersection(7, 65));
	}
}
