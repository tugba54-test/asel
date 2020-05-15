package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TaskFacebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="configs\\Task2.properies";
		 FileInputStream fileInput=new FileInputStream(path);
	     
		 Properties prop=new Properties();
		 prop.load(fileInput);
		 
		 System.setProperty("webdriver.chrome.driver", prop.getProperty("browser"));
		 WebDriver driver=new ChromeDiver();
		 driver.get(prop.getProperty("url"));

	}

}
