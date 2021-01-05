package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator_Concept 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://addons.mozilla.org/en-US/firefox/addon/morning-coffee/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Title for Parent is------"+driver.getTitle());
		
		driver.findElement(By.xpath("//a[@title='Learn how to create extensions and themes']")).click();
		
		Thread.sleep(3000);
		
		Set<String> childs = driver.getWindowHandles();
		
		Iterator<String> child = childs.iterator();
		
		while(child.hasNext())
		{
			String fchild = child.next();
			
			if(!parent.equalsIgnoreCase(fchild))
			{
				driver.switchTo().window(fchild);
				
				System.out.println("First child-----"+driver.getTitle());
				
				driver.findElement(By.linkText("Submit or Manage Extensions")).click();
				
				Thread.sleep(3000);
				
				Set<String> child1 = driver.getWindowHandles();
				
				Iterator<String> children = child1.iterator();
				
				while(children.hasNext())
				{
					String children1 = children.next();
					
					if(!(children1.equalsIgnoreCase(fchild))&& !(!children1.equalsIgnoreCase(parent)))
					{
						driver.switchTo().window(children1);
						
						System.out.println("Child 2 title is----"+driver.getTitle());
						
						Thread.sleep(3000);
					}
					
					
				}
				
				
			}
			
			
		}
		driver.switchTo().window(parent);
		
		System.out.println("FInal title is-----"+driver.getTitle());
	}

}
