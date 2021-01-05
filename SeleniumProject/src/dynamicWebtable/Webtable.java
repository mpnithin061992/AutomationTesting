package dynamicWebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Webtable {

	@Test
	public static void table() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://coredogs.com/lesson/web-page-tables.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='main-content']/div/div[2]/table/tbody/tr"));
		
		System.out.println("number of Rows are"+rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='main-content']/div/div[2]/table/tbody/tr[2]/td"));
		
		System.out.println("number of columns are"+columns.size());
		
		String data=driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/table/tbody/tr[4]/td[3]")).getText();
		
		System.out.println("contet is"+data);
		
		Thread.sleep(3000);
		
		for(int i=1;i<=columns.size();i++)
		{
			System.out.println("Header is "+driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/table/tbody/tr[1]/th["+i+"]")).getText());
			
		}
		
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				System.out.println("Data in each row is "+driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				SoftAssert sa=new SoftAssert();
				sa.assertEquals(true, false);
				sa.assertEquals(true, true);
				sa.assertEquals("Data", "data");
				sa.assertAll();
				
			}
		}

	}

}
