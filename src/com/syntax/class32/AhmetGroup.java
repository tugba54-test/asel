package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AhmetGroup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\16824\\eclipse-workspace2\\asel.java\\testData\\servetAbi.xlsx";
  FileInputStream fis=new FileInputStream(filePath);
  
  Workbook book=new XSSFWorkbook(fis);
  
  Sheet sheet=book.getSheet("Book");
  
  int row=sheet.getPhysicalNumberOfRows();
  int cell=sheet.getRow(0).getLastCellNum();
  
  List<Map<String,String>>list=new ArrayList<>();
  
  
  for(int r=1;r<row;r++) {
	  Map<String,String>map=new LinkedHashMap<>();
	  for(int c=0;c<cell;c++ ) {
		  String key=sheet.getRow(0).getCell(c).toString();
		  
		  String value=sheet.getRow(r).getCell(c).toString();
		  
		  map.put(key,value);
		  
	  }list.add(map);
  }
  
  System.out.println(list);
	}

}
