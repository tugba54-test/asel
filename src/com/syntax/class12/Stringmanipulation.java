package com.syntax.class12;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println("Letter at index 4 is "+letter5+".");
		//char letters=str.charAt(55);Runtime Exception----->StringIndexOutofBOUndsException
		//System.out.println(letters);
		
		//get all characters 1 by 1 from a String?
		char letter;
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			System.out.print(letter+"");
			
		}
		System.out.println();
		System.out.println("-----indexOf() FUNCTION------");
		
		String name="Syntax Technologies";
		int index=name.indexOf("y");
		System.out.println(index);
		
		int index1=name.indexOf("");
		System.out.println(index1);
		
		int index2=name.indexOf("Syntax");
		System.out.println(index2);
		
		int index3=name.indexOf("!");
		System.out.println("Index of not existing character= "+index3);
		
		int index4=name.indexOf("Technologies");
		System.out.println("Index of substring Technologies"+index4);
		
		int index5=name.indexOf("o");
		System.out.println("index of first o"+index5);
		
		int index6=name.lastIndexOf("o");
		System.out.println("Index of second o= "+index6);
		
		
		
		
		
		
		
		
		

	}

}
