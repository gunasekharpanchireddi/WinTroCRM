package com.WinPro.Records;

import com.WinPro.GenericLib.BaseTest;

import com.WinPro.Pages.Loginpage1;
import com.WinPro.Pages.recordstab;

public class RecordsTab extends BaseTest {
	public static void main(String args[]) throws Throwable
	{
Loginpage1 lp=new Loginpage1();
lp.loginpage();
recordstab rt=new recordstab();
rt.click();

	
	
	}

}
