package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;

public class Login {
@FindBy(id="userName") private WebElement ui;
@FindBy(id="passWord") private WebElement pw;
@FindBy(xpath="//input[@title='Sign In']") private WebElement signin;

public Login()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public void signin(String un,String psw )
{
	ui.sendKeys(un);
	pw.sendKeys(psw);
	signin.click();

	}

}