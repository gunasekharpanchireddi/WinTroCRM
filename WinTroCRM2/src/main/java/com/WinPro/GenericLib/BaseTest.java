package com.WinPro.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements iAutoConsts
{
	  
	public static WebDriver driver;
	public void openbrowser() throws Throwable {
	FileLib flib=new FileLib();
	String browsername=flib.readpropertydata(PROP_PATH, "browser");
	if(browsername.equalsIgnoreCase("chrome"))	
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();	
	}
	else
	{
		System.out.println("enter proper browser");
	}
	driver.manage().window().maximize();
	String testurl=flib.readpropertydata(PROP_PATH, "url");
	driver.navigate().to(testurl);
}
	
}