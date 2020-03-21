package com.syntax.class14;

public class Methodexamples {
	
	//want to create a method that will be grreding a person
	void greet() {
		System.out.println("Welcome");
	} void greet1(String name) {
		System.out.println("Hello "+name);
		
	}
	
   public static void main(String[]args) {
	   //how do i call method greet?--->first we need to create an object of the class
	   //where that method belongs
	   
	   //className variableName=new ClassName();
	   Methodexamples object1=new Methodexamples();
	   object1.greet1("Sarmed");
	   object1.greet1("Faisal");
	   object1.greet1("Jhon");
	   object1.greet1("Gulen");
	   
}
}
