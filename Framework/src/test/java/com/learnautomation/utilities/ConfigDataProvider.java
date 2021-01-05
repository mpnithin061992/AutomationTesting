package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;

	public ConfigDataProvider() throws IOException
	{
		File src=new File("./Configurations/config.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		pro=new Properties();
		pro.load(fis);
			
	}
	
	public String getDataFromConfig(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getURL()
	{
		return pro.getProperty("QAURL");
	}
}
