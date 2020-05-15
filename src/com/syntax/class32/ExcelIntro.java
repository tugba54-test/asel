package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro{
	public static void main(String[] args) throws IOException {
		
		//String filePath=System.getProperty("user.dir")+"\\testData\\Book1.xlsx";
		String FilePath1="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\IntroExcel.xlsx";
		System.out.println(FilePath1);
		
		FileInputStream fis=new FileInputStream(FilePath1);
		
		//accessing Workbook
		Workbook wbook=new XSSFWorkbook(fis);
		//accessing Sheet
		Sheet sheet=wbook.getSheet("Sheet2");
		//accessing row
		Row row1=sheet.getRow(0);
		//accessing cell
		Cell cell=row1.getCell(1);
		
		
		//get Value from cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);// we need to get LastName
		
		// how to get New york
		
		//accessing row
				Row row3=sheet.getRow(2);
				//accessing cell
				Cell r3cell3=row3.getCell(2);
				
				System.out.println(r3cell3.toString());
				
				//shorter way we are getting VA
				
				System.out.println(sheet.getRow(1).getCell(3).toString());
				
				//to retrieve values based on typwe// you can change double value
				double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
				System.out.println((int)cellv);
				
				
				//how to get 20151 in a string format
				String cell1=sheet.getRow(1).getCell(4).toString();
				String [] array=cell1.split("\\.");
				System.out.println(array[0]);
				
				
	}

}