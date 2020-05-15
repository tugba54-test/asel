package com.sntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class processdataFromXL {

	public static void main(String[] args) throws IOException {
		
		String fileP=System.getProperty("user.dir" )+"/testData.Exceptionsclass.xlsx";
		FileInputStream fis=new FileInputStream(fileP);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("class33");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>>xlData=new ArrayList<>();
		for(int r=1; r<rows;r++) {
			Map<String>
		}
		
	}

}
