package com.syntax.class11;
public class Stringkemal{
	public static void main(String [] args) {
	String s1="mustafak";
	String s3="mustafak";
	String s2=new String("mustafak");
	System.out.println(s2.length());
	System.out.println("0 inci index "+s2.charAt(0));
	System.out.println("5. indeks "+s2.charAt(5));
	System.out.println(s1.contentEquals(s2)+"10");
	System.out.println(s1==s3);
	System.out.println("5.indeks "+s1.charAt(5));
	System.out.println(s1.length());
	
	System.out.println(s2.startsWith("mu"));
    System.out.println(s2.startsWith("fa"));
    
    String str=new String("Welcome to Coronali World");
    System.out.print("Return value: ");
    System.out.println(str.toUpperCase());
    
    System.out.println(s1.contentEquals(s3));
    
    
    
    if(s1==s3) { //(s2.equals(s3))---->icerik olarak esit olmasi
    	System.out.println("esit");
	}
    String str1=new String("Welcome to Coronali World");
    System.out.print("Return value: ");
    System.out.println(str1.toLowerCase());
	}
}