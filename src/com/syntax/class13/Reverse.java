package com.syntax.class13;

public class Reverse {

	public static void main(String[] args) {
		// 1. How you will reverse a string
				// what is the difference between String and StringBuffer classes.
				// do we have reverse function---> String is an immutable obj.
		
		
		String name="hello";
		
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			reverse+=name.charAt(i);
			
		}System.out.println(reverse);
		
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
