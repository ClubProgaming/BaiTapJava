package coffee;

import junit.framework.TestCase;

public class coffeeTest extends TestCase
{
	public void testContructor() 
	{
		
		new Coffee("Hawanian kona", 15.95, 100);
		new Coffee("Ethiopian", 8.0, 1000);
		new Coffee("Colombian Supreme ", 9.5, 1700);
	}
	
	public void testCost()
	{
		assertEquals(
		new Coffee("Hawanian kona", 15.95, 100).cost(),1959.0);
		
		Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
		assertEquals(c2.cost(),8000.0);
		
		Coffee c3 = new Coffee("Colombian Supreme ", 9.5, 1700);
		assertEquals(c3.cost(), 16150.0);
	}
	
	public void testPriceOver() 
		{

			assertTrue(new Coffee("Hawaiian Kona", 15.95, 100)
			.priceOver(12));
	
			Coffee c2 = new Coffee("Ethiopian", 8.00, 1000);
	
			Coffee c3 = new Coffee("Colombian Supreme ", 9.50, 1700);
	
			assertFalse(c2.priceOver(12));
	
			assertFalse(c3.priceOver(12));

		}

}
