package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://iam.jnj.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'ControlRef4_TextBox1')]")).sendKeys("harshit singh");
				
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//button[@title='Search' and contains(@id,'ControlRef4_Button2')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'702274585') and contains(@id,'R00_Label6') ]")).click();
		
		//driver.quit();

	}

}
