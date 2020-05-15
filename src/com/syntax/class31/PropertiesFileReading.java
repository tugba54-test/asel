package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	private static final Set<Entry<Object, Object>> Object = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//toread the file
		//
     String filePath="\\Users\\16824\\eclipse-workspace2\\asel.java\\configs\\Examples.properties";
     //you can start config also
	//2. bring object of fileInputStream
     FileInputStream fileInput=new FileInputStream(filePath);
//to handle data from.properties file we need Property Class
    Properties prop= new Properties();
    prop.load(fileInput);
    
    String name=prop.getProperty("name");
    System.out.println(name);
    
    String city=prop.getProperty("city");
    System.out.println(city);
    
    String lastName=prop.getProperty("lastname");
    System.out.println(lastName);
    
    String Country=prop.getProperty("country");
    System.out.println(Country);
    
    // to read whole file
   Set<Object> keys=prop.keySet();
   for(Object key:keys) {
	   System.out.println(key+" value "+prop.get(key));
   }
   
   
}
}