package explicit_wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Program_Explict {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"))));
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();

	}

}
