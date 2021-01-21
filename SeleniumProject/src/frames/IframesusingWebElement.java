package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IframesusingWebElement 
{

	@Test
	public void iframedemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Users/NMP1/OneDrive%20-%20JNJ/Desktop/Nithin/frames.html");
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total count are"+ count);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='selenium_news']")));
		
		driver.findElement(By.id("dropdownButton")).click();		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click here for selenium tutorial")).click();
		
		
	}
}
