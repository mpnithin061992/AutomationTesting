package handlealert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_handle 
{
	@Test
	public void alerts() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		
		String message=driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		Assert.assertTrue(message.contains("Please select start place"));
		
		System.out.println("Pass");
		
		driver.quit();
	}
	
}
