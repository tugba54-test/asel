package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String FilePath1="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\Task1.xlsx";
		
		FileInputStream fis=new FileInputStream(FilePath1);
		
		//get an object of Workbook type---workbook is an interface
		Workbook wbook=new XSSFWorkbook(fis);//childclass XssfWorkbook
		
		
				Sheet sheet=wbook.getSheet("Sheet3");
				
		
		
		//need to find numbers of rows
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		int column=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++) {
			for(int c=0;c<column;c++) {
				System.out.print(sheet.getRow(r).getCell(c).toString()+"   ");
			}System.out.println();
		}
		

	}

}
