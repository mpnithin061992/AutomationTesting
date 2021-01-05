package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.jmx.LoggerDynamicMBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogTestCase 
{

	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger(LogTestCase.class);
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		log.warn("Just a warning message");
		
		WebDriver driver = new ChromeDriver();
		
		log.info("Chrome Started");
		
		driver.manage().window().maximize();
		
		log.info("Chrome Maximised");
		
		driver.get("https://google.com");
		
		log.error("Page Loaded");
		
		driver.close();
		
		log.fatal("This is a fatal message");
		

	}

}
