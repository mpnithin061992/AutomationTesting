package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Success_Failure_Message 
{
	WebDriver driver;
	public Success_Failure_Message(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(css="span.toast-message.ng-star-inserted")
	WebElement Message;
	
	public String Alert_Message()
	{
		return Message.getText();
	}

}
