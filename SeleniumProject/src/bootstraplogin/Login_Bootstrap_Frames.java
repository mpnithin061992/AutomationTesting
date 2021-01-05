package bootstraplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Bootstrap_Frames 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("get_sign_up")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.id("authMobile")).sendKeys("7907608367");

	}

}
