package com.stepdefinition;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GoogleSearch {
	public  WebDriver driver;
	
	
	PropertiesReader obj=new PropertiesReader();
	
	@Given("^open browser$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
		System.out.println("open browser");
	    System.out.println();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\New\\chromedriver_win32\\chromedriver.exe");
		  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\chromedriver.exe");
		   driver = new ChromeDriver();
		   Properties properties=obj.getProperty();
		   driver.get(properties.getProperty("BaseURL"));	
		   System.out.println(properties.getProperty("BaseURL"));
		   Thread.sleep(5000);
	}
	
	@Then("^Enter criteria$")
	public void Entercriteria() 
	{
		//driver.findElement(By.xpath(null))
	}
}
