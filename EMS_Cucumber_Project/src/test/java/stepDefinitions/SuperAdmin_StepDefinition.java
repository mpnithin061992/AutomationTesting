package stepDefinitions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.Helper;
import com.learnautomation.pages.Add_Plant_Page;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Esignature_Page;
import com.learnautomation.pages.Home_Page_SuperAdmin;
import com.learnautomation.pages.Login_Page;
import com.learnautomation.pages.Settings_Page_SuperAdmin;
import com.learnautomation.pages.Spinner;
import com.learnautomation.pages.Success_Failure_Message;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SuperAdmin_StepDefinition extends BaseClass
{
	Helper screen=new Helper();
	
	Login_Page login=PageFactory.initElements(driver, Login_Page.class);
	
	Spinner wait=PageFactory.initElements(driver, Spinner.class);
	
	Home_Page_SuperAdmin home=PageFactory.initElements(driver, Home_Page_SuperAdmin.class);
	
	Settings_Page_SuperAdmin settings=PageFactory.initElements(driver, Settings_Page_SuperAdmin.class);
	
	Add_Plant_Page add=PageFactory.initElements(driver, Add_Plant_Page.class);
	
	Esignature_Page esign=PageFactory.initElements(driver, Esignature_Page.class);
	
	Success_Failure_Message message=PageFactory.initElements(driver, Success_Failure_Message.class);;
	
	
	@Given("^User is in Home Page by entering and submitting the email id \"([^\"]*)\" from JJEDS Login and having superadmin access$")
    public void user_is_in_home_page_by_entering_and_submitting_the_email_id_something_from_jjeds_login_and_having_superadmin_access(String strArg1) throws Exception 
	{
		//login=PageFactory.initElements(driver, Login_Page.class);
		
		login.EMS_Login(strArg1);
		
		Thread.sleep(3000);
		
		Helper.CaptureScreenshot(driver);
		
		login.EMS_Login_click();
		
		Thread.sleep(2000);
		
		Helper.CaptureScreenshot(driver);
		
		//wait=PageFactory.initElements(driver, Spinner.class);
		
		wait.waiting(driver);
		
		//home=PageFactory.initElements(driver, Home_Page_SuperAdmin.class);
		
		home.tab_check();
		
		Helper.CaptureScreenshot(driver);
		
		home.Usericon_click();
		
		Thread.sleep(3000);
		
		Helper.CaptureScreenshot(driver);
		
		String userrole=home.user_role_check();
		
		Assert.assertTrue(userrole.equalsIgnoreCase("SUPERADMIN"));
		
        
    }

    @When("^User navigates to Settings page$")
    public void user_navigates_to_settings_page() 
    {
        home.Settings_Button();
        
        wait.waiting(driver);
        
        Helper.CaptureScreenshot(driver);
        
    }

    @Then("^Esignature page must be displayed with user entering the below details$")
    public void esignature_page_must_be_displayed_with_user_entering_the_below_details(DataTable tab) throws Exception 
    {
    	List<List<String>> obj = tab.asLists();
    	
        //esign=PageFactory.initElements(driver, Esignature_Page.class);
        
        esign.Username(obj.get(0).get(0));
        
        esign.Password(obj.get(0).get(1));
        
        esign.EsignatureReason(obj.get(0).get(2));
        
        esign.Comment(obj.get(0).get(3));
        
        Thread.sleep(3000);
        
        Helper.CaptureScreenshot(driver);
    }

    @And("^Clicks Plant icon$")
    public void clicks_plant_icon() throws Exception 
    {
    	//settings=PageFactory.initElements(driver, Settings_Page_SuperAdmin.class);
        
        settings.Plantbutton_Click();
        
        Thread.sleep(3000);
        
        Helper.CaptureScreenshot(driver);
        
    }

    @And("^clicks on Add Plant$")
    public void clicks_on_add_plant() throws Exception 
    {
        settings.AddPlantbutton_Click();
        
        Thread.sleep(3000);
        
        Helper.CaptureScreenshot(driver);
        
        wait.waiting(driver);
    }

    @And("^provides the below details in Plant Name,Serial Number,Region Name,Country Name,OPCO Name,Sector Name,Primary Owner Email,Secondary Owner Email,Description$")
    public void provides_the_below_details_in_plant_nameserial_numberregio_namecountry_nameopco_namesector_nameprimary_owner_emailsecondary_owner_emaildescription(DataTable tab) throws Exception 
    {
    	List<List<String>> obj = tab.asLists();
    	
    	//add=PageFactory.initElements(driver, Add_Plant_Page.class);
    	
    	add.Add_Plant_Name(obj.get(0).get(0));
    	
    	add.Add_Serial_Number(obj.get(0).get(1));
    	
    	add.select_region_name(obj.get(0).get(2));
    	
    	add.Add_Country_Name(obj.get(0).get(3));
    	
    	add.Add_Opco_Name(obj.get(0).get(4));
    	
    	add.Add_Sector_name(obj.get(0).get(5));
    	
    	add.Add_Primary_Ower(obj.get(0).get(6));
    	
    	add.Add_Secondary_Owner(obj.get(0).get(7));
    	
    	add.Add_Description(obj.get(0).get(8));
    	
    	Thread.sleep(3000);
    	
    	Helper.CaptureScreenshot(driver);
    	
    }

    @And("^click on Submit$")
    public void click_on_submit() throws Exception  
    {
        add.Submit_button();
        
        wait.waiting(driver);
        
        Thread.sleep(3000);
        
        Helper.CaptureScreenshot(driver);
    }
    
    @And("^User must able to click on sign$")
    public void user_must_able_to_click_on_sign() 
    {
    	esign.Sign();
    	
    	wait.waiting(driver);
    }
    
    @And("^follwoing success message must be displayed \"([^\"]*)\"$")
    public void follwoing_success_message_must_be_displayed_something(String strArg1) 
    {
    	//message=PageFactory.initElements(driver, Success_Failure_Message.class);
    	
    	String msg=message.Alert_Message();
    	
    	Assert.assertTrue(msg.equalsIgnoreCase(strArg1));
    	
    	Helper.CaptureScreenshot(driver);
        
    }
    
    @Then("^check if the submit button is disabled$")
    public void check_if_the_submit_button_is_disabled() throws Exception 
    {	
    	JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("scroll(0,1000)");
    	
    	Thread.sleep(3000);
    	
    	Helper.CaptureScreenshot(driver);
    	
    	add.Submit_status();
    }

    @And("^Primary Owner email & Secondary owner email is not accepting normal character like \"([^\"]*)\"$")
    public void primary_owner_email_secondary_owner_email_is_not_accepting_normal_character_like_something(String strArg1) throws Exception 
    {
        add.Add_Primary_Ower(strArg1);
        
        Thread.sleep(3000);
    	
    	Helper.CaptureScreenshot(driver);
    	
        add.Submit_status();
        
        add.Add_Secondary_Owner(strArg1);
        
        Thread.sleep(3000);
    	
    	Helper.CaptureScreenshot(driver);
    	
    	add.Submit_status();
        
    }

    

}
