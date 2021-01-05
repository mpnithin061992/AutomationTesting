package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings_Page_SuperAdmin 
{
	WebDriver driver;
	
	public Settings_Page_SuperAdmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[contains(text(),'Plant')]")
	WebElement Plantbutton;
	
	@FindBy(xpath="//div[contains(text(),'Add Plant')]")
	WebElement AddPlant;
	
	public void Plantbutton_Click()
	{
		Plantbutton.click();
	}
	
	public void AddPlantbutton_Click()
	{
		AddPlant.click();
	}

}
