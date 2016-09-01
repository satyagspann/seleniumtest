package com.excel.gspann;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {
	 FileInputStream fis;
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	 XSSFCell cell;
	
	@Test(dataProvider = "myDp")
	public void test(Object... string) {
		for(int i=0;i<string.length;i++)
		System.out.println("Value is:" +string[i].toString());
		myDp();
	}
	@DataProvider
	public  Object[][] myDp() {
		Object[][] obj = null;
		try {
			 fis = new FileInputStream("F:/satya.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 try {
			wb = new XSSFWorkbook (fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		 sheet = wb.getSheet("Sheet1");
		 int totalRows = sheet.getLastRowNum();//this returns index and not the actual count
		 int totalCols = sheet.getRow(1).getLastCellNum();//this method returns the actual column number and  not a index
		 obj = new Object[totalRows][totalCols];
		 int startRow = 1;
		 int startCol = 0;
		 int ci,cj;
		 ci=0;
		 for(int i = startRow; i<=totalRows; i++,ci++){
			 cj=0;
			 for(int j = startCol; j<totalCols; j++, cj++){
				 obj[ci][cj] = getData(i,j); //value from excel
			 }
		 }
		return obj;
		
	}
	public  Object getData(int r, int c){
		cell = sheet.getRow(r).getCell(c);
		int type = cell.getCellType();
		if(type==0){ //for integer type is 0
			return cell.getRawValue();
		}
		if(type==1){ //for String type is 1
			return cell.getStringCellValue();
		}
		
		else return null;
	}
}
