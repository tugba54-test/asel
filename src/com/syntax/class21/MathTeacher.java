package com.syntax.class21;

public class MathTeacher extends Teacher{
	public MathTeacher(String name, String lastName) {
		//super();compiler will make call implicitly if you not
		super(name, lastName);
	}
}
class JavaTeacher extends Teacher{
	//compiler will try to create default constructor
		//and make a call inside to parent class default constructor
//		JavaTeacher(){
//			super();
//		}
		
		String certifications;
		
		JavaTeacher(String name, String lastName, String certification){
			super(name, lastName);// super always must be first line inside 
			//your costructor
			this.certifications=certification;
		}
		
		JavaTeacher(String name, String lastName){
			super(name, lastName);
		}
	}




