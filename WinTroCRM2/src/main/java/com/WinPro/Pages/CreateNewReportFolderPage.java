package com.WinPro.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;

public class CreateNewReportFolderPage extends BaseTest {
@FindBy(name="newReportFolder") private WebElement newre;
public CreateNewReportFolderPage()
{
PageFactory.initElements(BaseTest.driver, this);	
}
public void newreportfolderpage() throws Throwable
{
newre.click();
FileLib fl=new FileLib();
WebDriverCommonLib wb=new WebDriverCommonLib();

WebElement pg1=BaseTest.driver.findElement(By.xpath("//td[text()='Create New Report Folder']"));
if(pg1.isDisplayed())
{
System.out.println("page is displayed,pass");	
}
else
{
	
	}



}
}
