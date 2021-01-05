package javascripexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOperation
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sg.mail.yahoo.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('login-username').value='mpnithin'");

	}

}
