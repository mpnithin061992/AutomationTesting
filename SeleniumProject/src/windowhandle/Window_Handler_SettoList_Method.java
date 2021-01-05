package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handler_SettoList_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent Window"+parent);
		
		Set<String> allwindows=driver.getWindowHandles();
		
		int a=allwindows.size();
		
		System.out.println("Number of widows are"+allwindows.size());
		
		ArrayList<String> tabs=new ArrayList<>(allwindows);
		
		for(int i=0;i<a;i++)
		{
			driver.switchTo().window(tabs.get(i));
			
			System.out.println("Title is :"+driver.getTitle());
			
			if(!parent.equalsIgnoreCase(tabs.get(i)))
			{
				driver.switchTo().window(tabs.get(i));
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		
	}

}
