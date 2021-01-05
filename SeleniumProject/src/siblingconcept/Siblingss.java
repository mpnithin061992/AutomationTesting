package siblingconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Siblingss 
{
	@Test
	public void iframedemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> menu = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div/div"));
		
		System.out.println(menu.size());
		
		for(int i=1;i<=menu.size();i++)
		{
			String a=driver.findElement(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div/div["+i+"]")).getText();
			
			System.out.println(a);
		}
		
		driver.close();
		
	}

}
