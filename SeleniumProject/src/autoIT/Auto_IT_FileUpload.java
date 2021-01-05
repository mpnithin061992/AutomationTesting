package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_IT_FileUpload 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://imgur.com/upload");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\AutoIT\\FileUpload.exe");

	}

}
