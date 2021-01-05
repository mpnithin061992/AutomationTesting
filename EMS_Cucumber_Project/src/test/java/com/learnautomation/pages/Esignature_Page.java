package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Esignature_Page 
{
	WebDriver driver;
	
	public Esignature_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="uname")
	WebElement Name;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="reason")
	WebElement Reason;
	
	@FindBy(name="rname")
	WebElement Comments;
	
	@FindBy(xpath="//button[text()='Sign']")
	WebElement submit;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement clear;
	
	public void Username(String usrname)
	{
		Name.sendKeys(usrname);
	}
	
	public void Password(String pswd)
	{
		Password.sendKeys(pswd);
	}
	
	public void EsignatureReason(String reason)
	{
		Select s=new Select(Reason);
		
		s.selectByVisibleText(reason);
		
	}
	
	public void Comment(String message)
	{
		Comments.sendKeys(message);
	}
	
	public void Sign()
	{
		submit.click();
	}
	
	public void Cancel()
	{
		clear.click();
	}
	

}
