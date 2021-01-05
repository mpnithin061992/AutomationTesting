package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spinner 
{
	WebDriver driver;
	
	public Spinner(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='spinner-wrapper fw fh']")
	WebElement Spinner;
	
	public void waiting(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.invisibilityOf(Spinner));
	}

}
