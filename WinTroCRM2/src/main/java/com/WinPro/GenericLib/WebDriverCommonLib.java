package com.WinPro.GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {
public String getpagetitle()
{
	String pagetitle=BaseTest.driver.getTitle();
	return pagetitle;
	
}
public void verify(String actual,String expected,String page)
{
	if(actual.equals(expected))
	{
		System.out.println(page+"is displayed,PASS");
}
	else
	{
		System.out.println(page+"is not displayed,FAIL");	
}}
	public void selectoption(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}	
	public void selectoption(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}	
	public void selectoption(String text,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}	
	public void mousehover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
		public void rightclick(WebElement element)
		{
			Actions ac=new Actions(BaseTest.driver);
			ac.contextClick(element).perform();
		}
		public void draganddropelement(WebElement source,WebElement target)
		{
			Actions ac=new Actions(BaseTest.driver);
			ac.dragAndDrop(source, target).perform();
		}
		public void doubleClick(WebElement element)
		{
			Actions ac=new Actions(BaseTest.driver);
			ac.doubleClick(element).perform();
		}
	public void switchframe(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchframe(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	public void switchframe(WebElement element)
	{
		BaseTest.driver.switchTo().frame(element);
	}
	
}
