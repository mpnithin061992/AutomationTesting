package Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Googlechrome {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//driver.get("https://google.com");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
