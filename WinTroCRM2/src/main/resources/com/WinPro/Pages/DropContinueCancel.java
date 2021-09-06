package com.WinPro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WinPro.GenericLib.BaseTest;

public class DropContinueCancel
{
    @FindBy(name="nextBtn") private WebElement con;
    @FindBy(name="cancel") private WebElement can;
    public DropContinueCancel()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    	
    }

	public void Cancel()
	{
		can.click();
	}
	public void Continue()
	{
		con.click();
	}

}
