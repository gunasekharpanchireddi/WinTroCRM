package com.WinPro.Records;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.WinPro.GenericLib.BaseTest;
import com.WinPro.Pages.Loginpage1;
import com.WinPro.Pages.create_new_record__drop__leads;
import com.WinPro.Pages.createnewrecord;
import com.WinPro.Pages.recordstab;

public class CreateNewRecord_drop_leads extends BaseTest {
    @Test
	public  void leads() throws Throwable {
		Loginpage1 l=new Loginpage1();
		l.loginpage();
		BaseTest.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		recordstab rt=new recordstab();
		rt.click();
		createnewrecord cnr=new createnewrecord();
		cnr.click();
		create_new_record__drop__leads cl=new create_new_record__drop__leads();
		cl.leads();
		

	}

}
