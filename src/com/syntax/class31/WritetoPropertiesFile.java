package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritetoPropertiesFile {

	public static void main(String[] args) throws IOException {
		// write existing file and add values
	     String filePath="\\Users\\16824\\eclipse-workspace2\\asel.java\\configs\\Examples.properties";

	    // FileInputStream fis=new FileInputStream(filePath);
	     Properties prop=new Properties();
	  //   prop.load(fis);
	     
	     prop.setProperty("phoneNumber", "123456789");
	     FileOutputStream fos=new FileOutputStream(filePath);
	     prop.store(fos, "Added additional Key");
	     
	     
	}

}
