package com.syntax.class11;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give CE
		//since concat() method is used to attach 1 String to another String
		//str2.concat(grade);
		
		System.out.println("---Empty function");
		
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println();
		
		System.out.println("---trim()  Function---");
		//removes empty/space  at the begining and end of the String
		String str4="Welcome to Syntax";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces: "+str4);
		

	}

}
