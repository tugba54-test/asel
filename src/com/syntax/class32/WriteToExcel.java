package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String FilePath1="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\Book1.xlsx";
		
		FileInputStream fis=new FileInputStream(FilePath1);
		
		//get an object of Workbook type---workbook is an interface
		Workbook wbook=new XSSFWorkbook(fis);//childclass XssfWorkbook
		
		
		//writing into existing sheet
		Sheet sheet=wbook.getSheet("Sheet1");
		//adding one Cell to excel
		sheet.getRow(0).createCell(7).setCellValue("FColor");
		sheet.createRow(4).createCell(0).setCellValue("Ahmet");
		Sheet customSheet=wbook.createSheet("TestSheet1");
		
		FileOutputStream fos=new FileOutputStream(FilePath1);
		wbook.write(fos);
	}

}
