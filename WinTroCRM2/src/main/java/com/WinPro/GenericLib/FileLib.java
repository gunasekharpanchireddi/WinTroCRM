package com.WinPro.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readpropertydata(String proppath,String key) throws Throwable
	{
FileInputStream fis=new FileInputStream(proppath);
Properties prop=new Properties();
prop.load(fis);
String propValue=prop.getProperty(key,"Incorrect Key");
return propValue;
}
public String readexceldata(String path,String sheetname,int row,int cell) throws Throwable	
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb= WorkbookFactory.create(fis);
	String excelvalue=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return excelvalue;
}
public int getrowcount(String path,String sheet) throws Throwable
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	int rowcount=wb.getSheet(sheet).getLastRowNum();
	return rowcount;
	
}
}




