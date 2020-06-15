package com.review11;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws Exception {

		String filePath="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\Elion11.xlsx";
		FileInputStream fis=new FileInputStream(filePath);//i am gonna read to file 
		
		//get the all file
		Workbook book=new XSSFWorkbook(fis);//i know this file is excel  apache tarafindan olustrulmus
		// apachi are valso called Jva llibrary or project(Polymorphism yapiyrz parent class i child class a
		//referance yapiyrz
		
		//get the whole file
		Sheet sheet=book.getSheet("review11");// ss le import yap
		
		//get the number of rowsin the current sheet,the last one that has data
		int row=sheet.getPhysicalNumberOfRows();
		Row header=sheet.getRow(0);//if you start some other rows
		
		//get the number of cells in the current row
    	int cell=sheet.getRow(0).getLastCellNum();
		cell=header.getLastCellNum();
		
		// Lets iteratethe header/row0
		for(int c=0;c<cell;c++) {
			String data=header.getCell(c).toString();
			System.out.print(data+"  ");
			
		}
		System.out.println();
		
		//lets iterate all the data rows(except header)
		for(int r=1;r<row;r++) {
			
			//for every row ,i will iterate the cells
			//lets get the cureent row
			Row curRow=sheet.getRow(r);
			
			//how many cells there are in the current row
			int currentCells=curRow.getLastCellNum();
			for(int c=0;c<cell;c++) {
				
				//first Method
//				Cell cellData=curRow.getCell(c);
//				String cellStringData=cellData.toString();
//				System.out.print(cellStringData+" ");
//				
				System.out.print(curRow.getCell(c).toString()+ "  ");
				
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
