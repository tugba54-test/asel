package com.syntax.class13;

public class Q5reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str1="today is monday weather is nice yayyy";
		   str1=str1.replaceAll(" ", "");
String reverse="";
		for(int i=(str1.length())-1;i>=0;i--) {
			reverse=reverse+str1.charAt(i);
			
		}System.out.print(reverse);
	}

}
