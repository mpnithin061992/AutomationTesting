package com.learnautomation.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utilities.ExcelDataProvider;
import com.learnautomation.utilities.Helper;


public class LoginTestEMS extends BaseClass
{

			
	@Test
	public void loginapp() throws IOException
	{
		
		logger=report.createTest("Login to EMS");
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		login.EMSLogin(exe.getStringData("Login",0,0));
		
		logger.pass("Application Logged");
		
		Helper.CaptureScreenshot(driver);
		
		logger.info("Screenshots are captured");
		
		
		
	}
}
