package cucmberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/selenium.feature", 
glue="stepDefinitions",tags = "@SuperAdmin",monochrome = true,strict = true,
plugin = {"pretty","html:target/cucumber","junit:target/cukes.xml","json:target/Cucumber.json"})
public class TestRunner_Selenium 
{
	
	

}
