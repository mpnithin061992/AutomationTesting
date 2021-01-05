package screenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot_Test 
{

	public static void screenshot_capture(WebDriver driver,String Name) throws Exception
	{
				
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshotss/"+Name+getCurrentDateTime()+".png"));
		
		System.out.println("screenshot taken");
		
		
	}


	public static String getCurrentDateTime()
	{
	
	DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	
	Date currentDate= new Date();
	
	return customFormat.format(currentDate);
	
	}
}
