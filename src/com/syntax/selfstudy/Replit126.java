package com.syntax.selfstudy;

public class Replit126 {
	 static String thirdLetter(String text) {
		 String s="";
		 for(int i=0;i<text.length();i+=3) {
			 s= s+text.charAt(i);
		 }
	 
		
return s;
	 }	
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}
	}

	
