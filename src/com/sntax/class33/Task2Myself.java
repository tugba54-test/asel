package com.sntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2Myself {
	
	static List<Exception> call(){
		List<Exception>exlist=new ArrayList <>();
		int a=60;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		
		String filePath="";
		try {
			FileInputStream fis=new FileInputStream(filePath);
			System.out.println(filePath);
		}catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		
		String z="Hello";
		try {
			char character=z.charAt(8);
			System.out.println(character );
		}catch (StringIndexOutOfBoundsException so) {
			System.out.println(so.getMessage());
		}
		
		int [] arr= {1,2,3};
		try {
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException aoi) {
			System.out.println(aoi);
		}
		
	
		return exlist;
		
	}

	public static void main(String[] args) {
		
		List<Exception>t=call();
		for(Exception a:t) {
			System.out.println(a);
		}
		
		Iterator<Exception>it=t.iterator();
        while(it.hasNext()) {
        	Exception ab=it.next();
        	System.out.println(ab.getMessage());
        }
		
	}

}
