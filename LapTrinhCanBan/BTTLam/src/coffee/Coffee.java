package coffee;

public class Coffee 
	{
		String kind;
		double price;
		double weight;
		
		Coffee(String kind, double price, double weight)
		{
		this.kind = kind;
		this.price = price;
		this.weight = weight;
		
		}
		
		double cost()
		{
			return this.weight * this.price;
		}
		
		boolean priceOver(double amount)
			{
				return this.price > amount;
			}
	}
		




