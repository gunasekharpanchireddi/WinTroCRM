package com.WinPro.Pages;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.GenericLib.FileLib;
import com.WinPro.GenericLib.WebDriverCommonLib;
import com.WinPro.Pages.Login;

public class Loginpage1 extends BaseTest {

	public void loginpage() throws Throwable {
		// TODO Auto-generated method stub
		BaseTest bt=new BaseTest();
		bt.openbrowser();
		FileLib fl=new FileLib();
		WebDriverCommonLib wdcl=new WebDriverCommonLib();
		wdcl.verify(wdcl.getpagetitle(),fl.readpropertydata(PROP_PATH, "logintitle") , "login page");
		Login l=new Login();
		l.signin(fl.readpropertydata(PROP_PATH, "username"), fl.readpropertydata(PROP_PATH, "password"));
		wdcl.verify(wdcl.getpagetitle(), fl.readpropertydata(PROP_PATH, "hometitle"), "hamepage");
	}

}
