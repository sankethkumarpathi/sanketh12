package practice;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.*;

public class demo {
	public static void main(String[]args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("D:\\for_java\\TestNgprograms\\src\\test\\resources\\sample.xlsx");
  Workbook wb = WorkbookFactory.create(fis);
  
		String data= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
						
	 			
				
				
				
	
		
	}
	

}