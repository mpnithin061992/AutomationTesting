package testng_session;

import org.testng.annotations.Test;

public class Invocation 
{
	@Test(invocationCount = 10)
	public void count()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Sum is ====>"+c);
	}

}
