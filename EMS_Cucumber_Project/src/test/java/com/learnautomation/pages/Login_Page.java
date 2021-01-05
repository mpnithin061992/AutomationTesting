package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page 
{
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="i0116")
	WebElement Emailbox;
	
	@FindBy(id="idSIButton9")
	WebElement Next;
	
	public void EMS_Login(String username)
	{
		Emailbox.sendKeys(username);
		
	}
	
	public void EMS_Login_click()
	{
		Next.click();
	}


}
