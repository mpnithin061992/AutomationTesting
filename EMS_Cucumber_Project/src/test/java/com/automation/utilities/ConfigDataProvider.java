package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;

	public ConfigDataProvider() throws IOException
	{
		File src=new File("./Configuration/Config.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		pro=new Properties();
		pro.load(fis);
			
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getURL()
	{
		return pro.getProperty("url");
	} 

}
