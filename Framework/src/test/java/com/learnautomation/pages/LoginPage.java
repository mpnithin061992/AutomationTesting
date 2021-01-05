package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="i0116")
	WebElement username;
	
	@FindBy(id="idSIButton9")
	WebElement Next;
	
	
	public void EMSLogin(String userid)
	{
		username.sendKeys(userid);
		Next.click();
	}
}
