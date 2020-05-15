package com.syntax.class13;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="java";
String b="Selenium";
a=a+b;
System.out.println(a);
b=a.substring(0,a.length()-b.length());
System.out.println(b);
a=a.substring(b.length(),a.length());
System.out.println(a);

String c="Merhaba";
String d="Hello";
String shortest=c+d;
c=shortest.replaceAll(shortest, c);
System.out.println(c);
d=shortest.replace(shortest, d);
System.out.println(d);




	}

}