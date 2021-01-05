package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Add_Plant_Page 
{
	WebDriver driver;
	
	public Add_Plant_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="plantName")
	WebElement PlantName;
	
	@FindBy(name="serielNo")
	WebElement Serialnumber;
	
	@FindBy(name="regionId")
	WebElement Regionname;
	
	@FindBy(name="countName")
	WebElement Countryname;
	
	@FindBy(name="opName")
	WebElement Opconame;
	
	@FindBy(name="sectorName")
	WebElement Sectorname;
	
	@FindBy(name="pName")
	WebElement PrimaryOwnerMail;
	
	@FindBy(name="sName")
	WebElement SecondaryOwnerMail;
	
	@FindBy(name="plantDesc")
	WebElement Description;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	WebElement Submit;
	
	@FindBy(xpath="//button[text()='CLEAR']")
	WebElement Clear;
	
	public void Add_Plant_Name(String name)
	{
		PlantName.sendKeys(name);
	}
	
	public void Add_Serial_Number(String serialid)
	{
		Serialnumber.sendKeys(serialid);
	}
	
	public void select_region_name(String region)
	{
		Select s= new Select(Regionname);
		
		s.selectByVisibleText(region);
	}
	
	public void Add_Country_Name(String country)
	{
		Countryname.sendKeys(country);
	}
	
	public void Add_Opco_Name(String Opco)
	{
		Opconame.sendKeys(Opco);
	}
	
	public void Add_Sector_name(String sector)
	{
		Sectorname.sendKeys(sector);
	}
	
	public void Add_Primary_Ower(String powner)
	{
		PrimaryOwnerMail.sendKeys(powner);
	}
	
	public void Add_Secondary_Owner(String sowner)
	{
		SecondaryOwnerMail.sendKeys(sowner);
	}
	
	public void Add_Description(String desc)
	{
		Description.sendKeys(desc);
	}
	
	public void Submit_button()
	{
		Submit.click();
	}
	
	public void Submit_status()
	{
		Assert.assertFalse(Submit.isEnabled());
	}



}
