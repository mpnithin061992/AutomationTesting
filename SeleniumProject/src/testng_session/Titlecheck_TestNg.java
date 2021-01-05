package testng_session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Titlecheck_TestNg 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
	}
	
	@Test (priority = 1,groups = "Title")
	public void title_check()
	{
		System.out.println("Title of the page is --"+driver.getTitle());
	}
	
	@Test (priority = 3,groups="Logo")
	public void LogoTest()
	{
		//driver.switchTo().frame("iframe");
		
		boolean b = driver.findElement(By.id("doodlevideo")).isDisplayed();
		
		if(b==true)
		{
			System.out.println("It is displayed");
		}
		
	}
	
	@Test (priority = 4,groups = "Test")
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test (priority = 5,groups = "Test")
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test (priority = 6,groups = "Test")
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test (priority = 2,groups = "Test")
	public void MailTest()
	{
		boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
