package sslcertificate;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SSL_Certifiacte_Issue 
{

	@Test
	public void certificate()
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions options=new ChromeOptions();
		
		options.merge(cap);
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cacert.org/");
	}
}
