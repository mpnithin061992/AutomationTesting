package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handler_firstexample_using2ndmethod {

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
		
		ArrayList<String> windowss=new ArrayList<>(allwindows);
				
		driver.switchTo().window(windowss.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Submit or Manage Extensions")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		ArrayList<String> s= new ArrayList<>(child);
				
		Thread.sleep(3000);
		
		driver.close();
				
		driver.switchTo().window(s.get(2));
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("myname");
		
		driver.close();
		
		driver.switchTo().window(windowss.get(0));
		
		System.out.println("Title is"+driver.getTitle());
		
		
		



	}

}
