package retryMechnasim;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrycheck implements IRetryAnalyzer
{
	int counter=0;
	int retrycount=3;
	
	public boolean retry(ITestResult result)
	{
		if(counter<retrycount)
		{
			counter++;
			return true;
		}
		return false;
	}

}
