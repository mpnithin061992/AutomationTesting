package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		
		Thread.sleep(3000);
		
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='iPhone SE']"))).perform();
		
		act.click(driver.findElement(By.xpath("//a[text()='iPhone SE']"))).build().perform();
		
		
		

	}

}
