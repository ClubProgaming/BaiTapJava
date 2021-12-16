package CD;

public class CD 
{
	String owner;
	int amount;
	
	
/**
	 * @param owner
	 * @param amount
	 */
	public CD(String owner, int amount) {
		this.owner = owner;
		this.amount = amount;
	}
	double interest() 
	{
		if (0 <= this.amount && this.amount < 500000)
			{
			return 0.02 * this.amount;
	
			}
		else 
			{
			if (500000 <= this.amount && this.amount < 1000000) 
				{
				return 0.0225 * this.amount;
				}
			else 
				{
				return 0.025 * this.amount;
				}
			}
	}	
}
