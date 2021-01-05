package Practise;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise_class 
{
	@Test
	public void demo() throws Exception
	{
		String strArg1="Brinjal";
		String strArg2="2";
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(strArg1);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(3000);
        
        String s=driver.findElement(By.xpath("//input[@class='quantity']")).getAttribute("value");
        
        System.out.println("value is"+s);
        do
        {
        	s=driver.findElement(By.xpath("//input[@class='quantity']")).getAttribute("value");
        	
        	if(s.contentEquals(strArg2))
        	{
        		break;
        	}
        	
        	driver.findElement(By.xpath("//a[@class='increment']")).click();
        	
        }while(!s.contentEquals(strArg1));
        
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        
        Thread.sleep(3000);
        
        String x= driver.findElement(By.xpath("//table[@id='productCartTables']/tbody/tr/td[2]/p")).getText();
        
        System.out.println("value is"+x);

	}

}
