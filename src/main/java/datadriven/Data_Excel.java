package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class Data_Excel {
  public static void main(String[]args) throws IOException {
	//declare file name and sheet name
	  
	String filepath="C:\\Users\\upasa\\Desktop\\Excel\\MyCSV.xlsx";
	String sheetname="mysheet";
	
	//loading of file
	
	FileInputStream file= new FileInputStream(new File(filepath));
	Workbook workbook= new XSSFWorkbook(file);
	
	//loading sheet
	Sheet sheet=workbook.getSheet(sheetname);
	
	//loading the row no (0)
	Row row=sheet.getRow(2);
	String username=row.getCell(0).getStringCellValue();
	String password=row.getCell(1).getStringCellValue();
      System.out.println(username);
      System.out.println(password);
  }
  
}