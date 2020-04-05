package com.syntax.class22;

public class Student {
//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism

	void read(String btypes,String name,int Id) {
		
		System.out.println(name+" likes to read "+btypes  );
	}
	void study(String name,String work,int Id) {
		System.out.println(name+ " "+Id+" studies their "+work);
	}
	void info(String name,int Id,String majority) {
		System.out.println("student name is "+name+" id is "+Id);
	}   }
		

class SyntaxStudent extends Student{
	void read(String btypes,String name) {
		
System.out.println(name+" likes to read "+btypes+" books "  );
	}
	
	void study(String name,String work,int Id) {
		System.out.println(name+ " "+Id+" studies "+work);
	}	
}
class CollegeStudent extends Student{
	void read(String btypes,String name) {
	System.out.println(name+" likes to read "+btypes+" loves "  );
	}
	void study(String name,int Id) {
		System.out.println(name+ " "+Id+" studies calculus");
	}
	void playSports(String sportType) {
		System.out.println("likes to play "+sportType );
		
	}
	}
	
	class SchoolStudent extends Student{
		
	void read(String btypes,String name,int Id) {
		System.out.println(name+" likes to read "+btypes  );
	}
	void info(String name,int Id,String majority) {
		System.out.println("student name is "+name+" id is "+Id+" school students");
	}
	void music(String name){
		System.out.println(name+ "likes to listening jaz music");
	}
	
	
}