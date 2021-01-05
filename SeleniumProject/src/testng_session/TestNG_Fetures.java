package testng_session;

import org.testng.annotations.Test;

public class TestNG_Fetures 
{

	@Test
	public void loginTest()
	{
		System.out.println("Login to app");
		//int i=9/0;
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void xomePage()
	{
		System.out.println("Home Page");
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void SearchPage()
	{
		System.out.println("SearchPage");
	}
	
	@Test (dependsOnMethods = "xomePage")
	public void SettigsPage()
	{
		System.out.println("SettigsPage");
	}
}
