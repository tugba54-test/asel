package com.syntax.class13;

public class Q1swap{
	public static void main(String [] args) {
		//write a program to swap 2 numbers without a temporary variable
		//swp withput temporary
		
		int a=124;
		int b=209;
		
		a=a+b;//a=32
		b=a-b;//b=12
		a=a-b;//a=20;
		System.out.println("the value of a= "+a);
		System.out.println("the value of b= "+b);
		
		String str1="hello";
		String str2="welcome";
		
		
		str1=str1+str2;//DayNight
		str2=str1.substring(0, 5);//Day(0, str1.length()-str2.length())
		str1=str1.substring(5);//Night
		System.out.println("the value of str1= "+str1);
		System.out.println("the value of str2= "+str2);
		
		
		//another way
		String s1="Syntax";
		String s2="technologies";
		
		String shorterstr1=s1+s2;
		s2=shorterstr1.replace(s2, "");
		s1=shorterstr1.replace(s2,"");
		
		System.out.println("the value of s1= "+s1);
		System.out.println("the value of s2= "+s2);
		
	}
}