package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadTaskFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	     String filePath="\\Users\\16824\\eclipse-workspace2\\asel.java\\configs\\Task.properties";
	     String userDirectory=System.getProperty("user.dir");
	     System.out.println(userDirectory);
	     String filePath1=userDirectory+"\\configs\\Task.properties";
	     System.out.println(filePath1);
	     System.out.println(System.getProperty("user.name"));
	     System.out.println(System.getProperty("os.name"));
	     
	     FileInputStream fileInput=new FileInputStream(filePath1);
	     Properties prop1= new Properties();
	     prop1.load(fileInput);
	     String brow=prop1.getProperty("browser");
	     System.out.println("Browser is "+brow);
	     
	     Set<Object> key=prop1.keySet();
	     for(Object keys:key) {
	    	 System.out.println("key "+keys+" value "+prop1.get(keys));
	     }
	}

}
