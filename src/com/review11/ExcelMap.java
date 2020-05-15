package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
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
		
		//Lets suppose that we know that there same number of cells in every row
				Map<String,String>marymap=new LinkedHashMap<>();
				
				//Lets create a  Mary's map
				for(int i=0;i<cell;i++) {
					String headerCell=sheet.getRow(0).getCell(i).toString();
					String marycell=sheet.getRow(2).getCell(i).toString();
					marymap.put(headerCell,marycell);
					
				}System.out.println(marymap);
				
				
				//i will have three maps
				//i will store three maps into a list
				List<Map<String,String>>mapList=new ArrayList<Map<String,String>>();
				
				//Iterating data rows,not header
				for(int i=1; i<row;i++) {
					
				Map<String,String>map=new LinkedHashMap<>();
				//Iterating cells
				for(int j=0;j<cell;j++) {
					map.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i).getCell(j).toString());
				}
				
				//after i filled the map, I am adding it into list
				mapList.add(map);
				}	
				System.out.println(mapList);

	}

}
