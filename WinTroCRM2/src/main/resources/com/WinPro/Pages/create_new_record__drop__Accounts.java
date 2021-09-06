package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;

public class create_new_record__drop__Accounts extends BaseTest {
	@FindBy(id="primarymodule") private WebElement led;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='Contacts']") private WebElement cont;
    @FindBy(name="nextBtn") private WebElement con;
    @FindBy(name="cancel") private WebElement can;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='Potentials']") private WebElement poten;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='Products']") private WebElement produ;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='Quotes']") private WebElement quo;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='SalesOrders']") private WebElement sales;
	@FindBy(xpath="//select[@id='Accountsrelatedmodule']/descendant::option[@value='Invoices']") private WebElement invo;
	
public create_new_record__drop__Accounts()
{
PageFactory.initElements(BaseTest.driver, this);	
}
public void accounts() throws Throwable
{
WebDriverCommonLib wdcl=new WebDriverCommonLib();
//for contacts
wdcl.selectoption(led, "Accounts");
led.click();
cont.click();
con.click();
FileLib fl=new FileLib();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
cont.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();
//for potentials
wdcl.selectoption(led, "Accounts");
led.click();
poten.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
poten.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();

// for products
wdcl.selectoption(led, "Accounts");
led.click();
produ.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
produ.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();

// for Quotes
wdcl.selectoption(led, "Accounts");
led.click();
quo.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
quo.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();
// for sales orders
wdcl.selectoption(led, "Accounts");
led.click();
sales.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
sales.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();
// for invoices
wdcl.selectoption(led, "Accounts");
led.click();
invo.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
wdcl.selectoption(led, "Accounts");
led.click();
invo.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.navigate().back();
//for accounts with continue button
wdcl.selectoption(led, "Accounts");
led.click();
con.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordinformation"),"records information page");
BaseTest.driver.navigate().back();
// for accounts with cancel button
wdcl.selectoption(led, "Accounts");
led.click();
can.click();
wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "recordstitle"),"records home page");
BaseTest.driver.quit();




}
}
