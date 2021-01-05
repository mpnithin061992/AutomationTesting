package testng_session;

import org.testng.annotations.Test;

public class ExceptionTimeout 
{
/*	@Test(invocationCount = 1,invocationTimeOut = 2)
	public void infiniteloop()
	{
		int i=1;
		
		while(i==1)
		{
			System.out.println("one");
		}
	}
*/
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void except()
	{
		String a="100A";
		Integer.parseInt(a);
	}
}
