package javascripexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_field 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement create=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
		highlight(driver,create);
		
		create.click();
		
		Thread.sleep(3000);
		
		WebElement fname=driver.findElement(By.name("firstname"));
		
		highlight(driver, fname);
		
		fname.sendKeys("nithin");
		
		WebElement lname=driver.findElement(By.name("lastname"));
		
		highlight(driver, lname);
		
		lname.sendKeys("MP");
		

	}
	
	public static void highlight(WebDriver driver,WebElement element) throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('style','backgroud: yellow; border:2px solid red;');", element);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].setAttribute('style','border:2px white')", element);
	}

}
