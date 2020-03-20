package com.syntax.class11;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String school="Syntax";
		
		String str=new String("Hello");
		String str1="this is a String 343590909^&*()_";
		//how many character String has
		System.out.println(str1.length()+" (12.) line");
		
		//size
		System.out.println(school.length());
		
	
		//convert String to lowercase or uuppercase
		System.out.println(school.toUpperCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		System.out.println("----concat   function---");
		//concatinate 2 Strings
		String day="Saturday";
		String date="14";
		//attaching 2 String
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give CE
		//since concat() method is used to attach 1 String to another String
		//str2.concat(grade);
		//WE CAN NOT ATTACH STRING AND CHAR ----THIS IS IMPRTANT
		
		
		System.out.println("---Empty function");
		
		String str3="";
		
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("---trim()  Function---");
		//removes empty/space  at the begining and end of the String
		String str4="   Welcome to Syntax!     ";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces: "+str4);
		

	}

}
