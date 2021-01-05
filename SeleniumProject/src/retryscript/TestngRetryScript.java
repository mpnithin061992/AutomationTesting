package retryscript;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestngRetryScript 
{
	
	@Test(retryAnalyzer = retryMechnasim.Retrycheck.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}

}
