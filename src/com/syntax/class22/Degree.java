package com.syntax.class22;

public class Degree {
//	Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To get a degree you need high school diploma”“. 
//	Class ‘Degree’ has 2 subclasses namely ‘Bachelors’ and Masters’. In Masters class override method ‘getPrerequisite’.
//	Call the method by creating an object of each of the three classes.
//	Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.

	 void getPrerequisite(){
		 System.out.println("To get a degree you need high school diploma");
		 
		
	}

}
class Bachelors extends Degree{
	
	void getPrerequisite(){
	super.getPrerequisite();
	System.out.println("your score needs to be high");
		
		 
		
	}
	
}
class Masters extends Degree{
	void getPrerequisite(){
		super.getPrerequisite();
		System.out.println("To get a degree you need Bachelors   diploma");
		 
		
	}
	
}