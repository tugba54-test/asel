package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		String filePath=System.getProperty( "user.dir")+"//configs//demo.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		
//		       FirstName=jhon=smith
//				LastName:Smith
//				Age 30
//				#wrong Format
//				Number-->123 
//				#consider is a key
//				School|Syntax
//
//				#Reassign
//				#FirstName=Omar
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		//1st way Get the value as Object and downcast into a string
		String lastname=(String)prop.get("LastName");
		System.out.println("Last Name is--> "+lastname);
		
		//2nd wayget the value as aString
		String first=prop.getProperty("FirstName");
		System.out.println("First name is --> "+first);
		String number=prop.get("Number-->123").toString();
		System.out.println(number);
		
		
		//String school=prop.getProperty("School|Syntax");
		
		//System.out.println("School|Syntax--> "+school);
		
		//1st way use getProperty method to getage as a String
		String age=prop.getProperty("Age");
	
		System.out.println(age);
		
		//add more key,ValuePairs
		prop.setProperty("StudentNumber", "123");
		System.out.println(prop);
		
		//or we can override(reasiign the name)
		prop.setProperty("FirstName", "omar");
		System.out.println(prop);
		
		
		//lets write/save back into the properties file
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Hi there");
		System.out.println("Done");
	}

}
