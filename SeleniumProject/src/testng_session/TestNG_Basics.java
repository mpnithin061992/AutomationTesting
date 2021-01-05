package testng_session;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics 
{
	@BeforeSuite //1
	public void setup()
	{
		System.out.println("Setup System properties of chrome");
	}
	
	@BeforeTest //2
	public void  lauchBrowser()
	{
		System.out.println("Launching Browser");
	}
	
	@BeforeClass //3
	public void login()
	{
		System.out.println("login to app");
	}
	
	
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	@Test //5
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	
	@AfterMethod  //6
	public void logout()
	{
		System.out.println("Logout App");
	}
	
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("Closing all Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("Delete all cookies");
	}
	
	@AfterSuite //9
	public void generateReport()
	{
		System.out.println("Generate Test Report");
	}

}
