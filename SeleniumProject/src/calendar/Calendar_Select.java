package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_Select 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")));
		
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		
		String date="23-November-2020";
		
		String emonth=date.split("-")[1];
		
		String eyear=date.split("-")[2];
		
		String edate=date.split("-")[0];
		
		System.out.println(emonth+"*****"+eyear+"*****"+edate);
		
		String amonth=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().trim();
		
		String ayear=driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().trim();
		
		while(!emonth.equalsIgnoreCase(amonth) || !eyear.equalsIgnoreCase(ayear))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			amonth=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().trim();
			
			ayear=driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().trim();
		}
		
		List<WebElement> adates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody[1]//td"));
		
		int count=adates.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement adate=adates.get(i);
			
			String dates=adate.getText();
			
			System.out.println(dates);
			
			dates.trim();
			
			if(dates.equals(edate))
			{
				adate.click();
				break;
			}
		}

	}

}
