package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;

public class create_new_record__drop__leads extends BaseTest {
	@FindBy(id="primarymodule") private WebElement led;
	@FindBy(xpath="//select[@id='Leadsrelatedmodule']/descendant::option[text()='Products']") private WebElement pro;
	@FindBy(xpath="//input[@value='Continue']") private WebElement con;
	@FindBy(xpath="//select[@id='Leadsrelatedmodule']/descendant::option[text()='Campaigns']") private WebElement cam;
	@FindBy(xpath="//input[@name='cancel']") private WebElement can;
	public create_new_record__drop__leads()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void leads() throws Throwable
	{
		WebDriverCommonLib wbcl=new WebDriverCommonLib();
		wbcl.selectoption(led, "Leads");
		led.click();
		pro.click();
		con.click();
		FileLib fl=new FileLib();
		WebDriverCommonLib wdcl=new WebDriverCommonLib();
		wdcl.verify(wdcl.getpagetitle(), fl.readpropertydata(PROP_PATH,"recordinformation"), "records information page");
		BaseTest.driver.navigate().back();
		led.click();
		cam.click();
		con.click();
		wdcl.verify(wdcl.getpagetitle(), fl.readpropertydata(PROP_PATH,"recordinformation"), "again,records information page");
		BaseTest.driver.navigate().back();
		led.click();
		pro.click();
		can.click();
		wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"), "records page");
		BaseTest.driver.navigate().back();
		led.click();
		cam.click();
		can.click();
		wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"), "records page");
		BaseTest.driver.navigate().back();
		led.click();
		can.click();
		wdcl.verify(wdcl.getpagetitle(), fl.readpropertydata(PROP_PATH,"recordinformation"), "again,records information page");
		BaseTest.driver.navigate().back();
		led.click();
		can.click();
		wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"), "records page");
		
	}

}
