package testScript;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import pageObject.LoginPageObject;

public class BaseTest extends ReusableTestComponents

{
    
	@Test (dataProvider="excelData")
	public void tc01(String unName,String unPass)  
	{
     System.out.println(unName + " " + unPass);
	}
  @DataProvider(name="excelData")
	public Object[][] getExcelData() throws IOException 
	
	{
		String filepath="C:\\Users\\upasa\\Desktop\\Excel\\MyCSV.xlsx";
		String sheetname="mysheet";
		
		return Excel_util.readExcelData(filepath, sheetname);
	}
	
	
	
}
