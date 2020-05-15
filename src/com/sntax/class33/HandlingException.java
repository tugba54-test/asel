package com.sntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fPath="";
		try {
			FileInputStream fis=new FileInputStream(fPath);
		}catch(FileNotFoundException fne) {
			System.out.println("catched FileNot Found Exception");
		}
		System.out.println("Continue to next try block");
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);//new ArithmeticException
			System.out.println("I am code inside try block");
		}catch ( RuntimeException ae){//we can put grandparent mean Exception or grand grand parent Throwable
			System.out.println("Catched Arithmetic Exception Exception");
		}
		System.out.println("End of the program");

	}

}
