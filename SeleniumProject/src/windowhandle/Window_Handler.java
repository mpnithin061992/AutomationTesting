package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handler {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://addons.mozilla.org/en-US/firefox/addon/morning-coffee/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent Window"+parent);
		
		driver.findElement(By.xpath("//a[@title='Learn how to create extensions and themes']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		System.out.println("Number of widows are"+allwindows.size());
		
		for(String s:allwindows)
		{
			if(!parent.equalsIgnoreCase(s))
			{
				driver.switchTo().window(s);
				
				driver.findElement(By.linkText("Submit or Manage Extensions")).click();
				
				Thread.sleep(3000);
				
				driver.close();
				
				System.out.println("After closing the browser"+driver.getTitle());
				
				Set<String> Child_child=driver.getWindowHandles();
				
				for(String y:Child_child)
				{
					if(!parent.equalsIgnoreCase(y))
					{
						driver.switchTo().window(y);
						
						Thread.sleep(10000);
						
						driver.findElement(By.name("email")).sendKeys("myname");
						
						Thread.sleep(3000);
						
						driver.close();
					}
				}
				
				
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("Title is"+driver.getTitle());



	}

}
