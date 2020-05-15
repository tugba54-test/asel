package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteTaskFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Path="configs\\Task.properties";
		
		 FileInputStream file=new FileInputStream(Path);
		Properties prop1=new Properties();
		prop1.load(file);
		
		prop1.setProperty("phoneNumber", "123456789");
	     FileOutputStream fos=new FileOutputStream(Path);
	     prop1.store(fos, "Added additional Key");

	}

}
