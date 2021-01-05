package stepDefinitions;

import com.learnautomation.pages.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass
{
	BaseClass base=new BaseClass();
	
	@Before("@SuperAdmin")
	public void beforeSIT() throws Exception
	{
		BaseClass.getdriver();
	}
	
	@After("@SuperAdmin")
	public void afterSIT()
	{
		base.teardown(driver);
	}
	
	
}
