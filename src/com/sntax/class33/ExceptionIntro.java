package com.sntax.class33;

public class ExceptionIntro{
	
	static String str;
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		//System.out.println("End of the program");
		
		int [] array= {12,1,13};
		
		//System.out.println(array[3]);------>ArrayIndexOutOfBoundsException
		//System.out.println(str.length());---->NullPointerException
		
		NullPointerException npe=new NullPointerException();
		throw(npe);
	}
}