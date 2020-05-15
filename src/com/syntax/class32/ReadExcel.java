package com.syntax.class32;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws  Exception {
		String FilePath1="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\IntroExcel.xlsx";
		
		FileInputStream fis=new FileInputStream(FilePath1);
		
		//get an object of Workbook type---workbook is an interface
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet2");
		
		//need to find numbers of rows
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		//find number of columns
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		
		//get data from all rows and all columns
		for(int r=0;r<rows;r++) {//iterates over rows
			for(int c=0;c<column;c++) {//iterates over cols
				System.out.print(sheet.getRow(r).getCell(c)+"  ");
				
			}System.out.println();
		}
		
		
		
		
		wbook.close();
		
		
		
		
		
	}

}
