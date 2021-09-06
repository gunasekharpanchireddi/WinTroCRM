package com.WinPro.Records;


import com.WinPro.Pages.CreateNewReportFolderPage;
import com.WinPro.Pages.Loginpage1;
import com.WinPro.Pages.recordstab;

public class CreateNewRecordFolder {

	public static void main(String[] args) throws Throwable {
		Loginpage1 l=new Loginpage1();
		l.loginpage();;
		recordstab rt=new recordstab();
		rt.click();
		CreateNewReportFolderPage fp=new CreateNewReportFolderPage();
		fp.newreportfolderpage();
		

	}

}
