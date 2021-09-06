package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;

public class recordstab extends BaseTest {
	@FindBy(xpath="//a[text()='Reports']") private WebElement rep; 
	public recordstab()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void click() throws Throwable
	{
		rep.click();
	
	FileLib fl=new FileLib();
	WebDriverCommonLib wdcl=new WebDriverCommonLib();
	wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"), "records page");
	
	
	}

	

}
