package com.syntax.class11;

public class StringCompare {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello";
		
		if(str1.equals(str2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("they are not equal");
		}
		System.out.println("----COMPARING == OPERATOR");
		if(str1==str2) {// we are comparing the memory
			System.out.println("String are equal");
		}else {
			System.out.println("they are not equal");
		}
		
		if(str1==str3) {
			System.out.println("str1 is equal to str3");
		}else {
			System.out.println("str1 and str3 is not equal");
		}

	}

}
