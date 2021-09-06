package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;

public class createnewrecord extends BaseTest {
	@FindBy(name="newReport") private WebElement newre;


public  createnewrecord()
{
PageFactory.initElements(BaseTest.driver, this);	
}
public void click() throws Throwable
{
newre.click();	
FileLib fl=new FileLib();
WebDriverCommonLib wdcl=new WebDriverCommonLib();
wdcl.verify(wdcl.getpagetitle(), fl.readpropertydata(PROP_PATH, "CreateNewReportTitle"), "createnewreport page");

}
}