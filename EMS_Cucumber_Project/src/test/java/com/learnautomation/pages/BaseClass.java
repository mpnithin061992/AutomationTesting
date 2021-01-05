package com.learnautomation.pages;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utilities.ConfigDataProvider;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static WebDriver getdriver() throws Exception
	{
		ConfigDataProvider config= new ConfigDataProvider();
		
		String browser = config.getBrowser();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Interet Explorer"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver= new ChromeDriver();
		}
		
		else
		{
			System.out.println("This application is not supported in this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		
		driver.manage().window().maximize();
		
		driver.get(config.getURL());
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
		return driver;
	}
	
	public void teardown(WebDriver driver)
	{
		driver.close();
	}

}
