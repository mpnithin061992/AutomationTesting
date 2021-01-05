package com.learnautomation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ConfigDataProvider;
import com.learnautomation.utilities.ExcelDataProvider;
import com.learnautomation.utilities.Helper;

public class BaseClass 
{
	public WebDriver driver;
	public ExcelDataProvider exe;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupSuite() throws IOException
	{
		Reporter.log("Setting up reports and Test started", true);
		exe=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/EMS"+Helper.getCurrentDateTime()+".html"));
		report= new ExtentReports();
		report.attachReporter(extent);
		
		Reporter.log("Setting Done - Test can be started", true);
	}
	
	@BeforeClass	
	public void setup()
	{
		Reporter.log("Trying to start browser and getting application ready", true);
		
		driver=BrowserFactory.startApplication(driver, config.getBrowser(),config.getURL());
		
		Reporter.log("Browser and Application is up and running", true);
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void teardownMethod(ITestResult result) throws IOException
	{
		Reporter.log("Test is about to end", true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.CaptureScreenshot(driver);
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.skip("Test Skipped", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}
		
		report.flush();
		
		Reporter.log("Test completed >>>>> Reports are generated", true);
	}
	

}
