package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample2 {

	public static void main(String[] args)   {
		multipleSleep();
		try {
			read("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//we can use try and catch also
	}
	
	public static void multipleSleep()  {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);
	}

}
