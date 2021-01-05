package sortinglist;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;

import screenshot.Screenshot_Test;

import javax.swing.ListCellRenderer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_Descending 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select s=new Select(driver.findElement(By.id("tools1")));
		
		List<WebElement> ele=s.getOptions();
		
		List actuallist=new ArrayList();
		
		for(WebElement i:ele)
		{
			String a=i.getText();
			actuallist.add(a);
		}
		
		List temp=new ArrayList();
		
		temp.addAll(actuallist);
		
		Collections.sort(temp);
		
		Assert.assertTrue(actuallist.equals(temp));
		
		Screenshot_Test obj;
		
		Screenshot_Test.screenshot_capture(driver, "Step-1");
		
		

	}

}
