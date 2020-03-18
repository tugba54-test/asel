package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		//to compare 2 Strings
		System.out.println("---equals() equalsIgnoreCase() Function");
		System.out.println(str1.contentEquals(str2));
    //false cunku slerin biri buyuk
		System.out.println(str1.equalsIgnoreCase(str2));
		// buyuk kucuk durumunu ignore case yaptik
		
		String expected="Home- Syntax Technologies";
		String actual="Home- Syntax Technologies";
		if (actual.contentEquals(expected)) {
			System.out.println("test case pass. titles are matched");
		}else {
			System.out.println("Test case fails,titles are not matched");
		}
		System.out.println("---First trim and then Compare---");
		if(actual.trim().contentEquals(expected)) {
			System.out.println("test case pass. titles are matched");
		
	}else {
		System.out.println("Test case fails,titles are not matched");
	}
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("test executed on chrome browser");
		}System.out.println("or ---");
		if(browser.toLowerCase().contentEquals("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
	}
}
