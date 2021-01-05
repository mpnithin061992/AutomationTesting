package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Home_Page_SuperAdmin 
{
	WebDriver driver;
	
	public Home_Page_SuperAdmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[text()='Home']")
	WebElement Hometab;
	
	@FindBy(xpath="//i[@class='fa fa-user-circle']")
	WebElement UserIcon;
	
	@FindBy(xpath="//label[contains(text(),'SUPERADMIN')]")
	WebElement Userrole;
	
	@FindBy(xpath="//div[text()='Settings']")
	WebElement Settings;
	
	public void tab_check()
	{
		Assert.assertEquals(Hometab.getText(), "Home");
	}
	
	public void Usericon_click()
	{
		UserIcon.click();
	}
	
	public String user_role_check()
	{
		return Userrole.getText();
	}
	
	public void Settings_Button()
	{
		Settings.click();
	}

}
