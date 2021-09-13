package com.WinPro.Records;

import org.testng.annotations.Test;

import com.WinPro.Pages.Loginpage1;
import com.WinPro.Pages.createnewrecord;
import com.WinPro.Pages.recordstab;

public class CreateNewRecord {
    @Test
	public  void NewRecord() throws Throwable {
		Loginpage1 l=new Loginpage1();
		l.loginpage();
		recordstab rt=new recordstab();
		rt.click();
		createnewrecord cnr=new createnewrecord();
		cnr.click();
		
		
		

	}

}
