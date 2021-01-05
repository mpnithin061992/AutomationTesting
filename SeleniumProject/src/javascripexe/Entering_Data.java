package javascripexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entering_Data 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sg.mail.yahoo.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement sign=driver.findElement(By.xpath("//span[text()='Sign in']"));
		
		js.executeScript("arguments[0].click()",sign);
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("login-username"));
		
		js.executeScript("arguments[0].value='mpnithin1992@yahoo.in'",username);
		
		WebElement checkbox=driver.findElement(By.xpath("//label[@for='persistent']"));
		
		js.executeScript("arguments[0].click()",checkbox);

	}

}
