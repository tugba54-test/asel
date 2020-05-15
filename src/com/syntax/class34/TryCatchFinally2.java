package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		division(10,2);
		division(10,0);
      System.out.println("-----End of the Code------");
      read("");
      
		
		
	}

	public static int division(int num,int num2) {
		int result=0;
		try {
			result=num/num2;
			System.out.println(result);
		}catch (ArithmeticException ae) {
			//ae.printStackTrace();//detail message of an exception
			System.out.println(ae.getMessage());
			//System.out.println(ae);
			
		}finally {
			System.out.println("I am finally block");
		}
		return result;
	}
	
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis = null;
		try {
			 fis=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(fis);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fis!=null) {
				fis.close();
			}
				}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
