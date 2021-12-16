package Entry;
import junit.framework.TestCase;

public class EntryTest extends TestCase
{
	public void TestDateContructor()
	{
		new Date(23, 3, 2004);
		
	}
	public void Testentrycontructor()
	{
		new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
	}
}
