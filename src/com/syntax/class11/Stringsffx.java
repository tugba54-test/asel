package com.syntax.class11;

public class Stringsffx {

	public static void main(String[] args) {
		// boolean endsWith
		String str=("this is really not");
		boolean retVal;
		retVal=str.endsWith("not");
		System.out.println("Value = "+retVal);
		
		System.out.println("BOOLEAN IS EMPTY");
		
		retVal=str.endsWith("no");
		System.out.println("Value = "+retVal);
		String str1="";
		boolean b=str1.isEmpty();
		System.out.println(b);
		
		System.out.println("STRING CONCAT(STRING STR");
		// deger ekleme
		String s1="strings are immutable";
		s1=s1.concat(" all the time");
				System.out.println(s1);
		

	}

}
