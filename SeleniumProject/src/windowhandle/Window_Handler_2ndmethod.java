package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handler_2ndmethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent Window"+parent);
		
		Set<String> allwindows=driver.getWindowHandles();
		
		System.out.println("Number of widows are"+allwindows.size());
		
		for(String s:allwindows)
		{
			if(!parent.equalsIgnoreCase(s))
			{
				driver.switchTo().window(s);
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
