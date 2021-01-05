package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpRequest;

public class BrokenLinks_Test 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Automation\\ChromeDriver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		
		int size=ele.size();
		
		System.out.println("Total Links are"+ size);
		
		for(int i=0;i<size;i++)
		{
			WebElement link = ele.get(i);
			
			String url = link.getAttribute("href");
			
			verifyLink(url);
			
			
		}
		

	}

	
	public static void verifyLink(String linkurl) throws IOException
	{
		URL url=new URL(linkurl);
		
		HttpURLConnection httpURLconnection = (HttpURLConnection) url.openConnection();
		
		httpURLconnection.setConnectTimeout(3000);
		
		httpURLconnection.connect();
		
		if(httpURLconnection.getResponseCode()==200)
		{
			System.out.println(linkurl+" - "+httpURLconnection.getResponseMessage());
		}
		
		if(httpURLconnection.getResponseCode()==httpURLconnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+" - "+httpURLconnection.getResponseMessage()+" - "+httpURLconnection.HTTP_NOT_FOUND);
		}
		
		
	
	
	}
}
