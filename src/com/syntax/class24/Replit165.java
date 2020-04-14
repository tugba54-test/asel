package com.syntax.class24;

public abstract  class Replit165 {
//Create a Parent Class that will have two overloaded abstract methods m1
//Make Main class as concrete subclass to Parent Class 
//In main method call the methods. 
//Expected Output:m1 without parameters
//	            m1 method with parameter
	abstract void m1();
	abstract void m1(int a);
	
}
class Super extends Replit165 {

	@Override
	void m1() {
System.out.println("m1 without parameters");		
	}

	@Override
	void m1(int a) {
System.out.println("m1 method with parameters");		
	}
	
}
