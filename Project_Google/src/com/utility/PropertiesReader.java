package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
	
	public Properties getProperty()
	{
		Properties properties =new Properties();
		try
		{
			properties.load(new FileInputStream("C:\\Users\\Irfan\\eclipse-workspace\\Project_Google\\resources\\Config-properties.properties"));
		}catch(Exception e) {}
		return properties;

}
}