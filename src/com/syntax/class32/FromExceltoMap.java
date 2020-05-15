package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExceltoMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String FilePath1="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\IntroExcel.xlsx";
		
		FileInputStream fis=new FileInputStream(FilePath1);
		
		//get an object of Workbook type---workbook is an interface
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet2");
		int row=sheet.getPhysicalNumberOfRows();
		int column=sheet.getRow(0).getLastCellNum();
		List<Map<String,String>>listmap=new ArrayList<>();
		for(int r=1;r<row;r++) {
			
			Map<String,String>map=new LinkedHashMap<>();
			for(int c=0;c<column;c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			listmap.add(map);
		}
		System.out.println(listmap);

	}

}
