package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleandRightClick 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		Thread.sleep(10000);
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='demo code-demo']/iframe")));
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Double click the block']"))).build().perform();
		
		

	}

}
