package com.syntax.class22;

public class Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bk=new Bank(500.0);
		System.out.println(bk.chargeFee());
		BOA b=new BOA (1000);
		System.out.println(b.chargeFee());
		
		
		
		
		System.out.println(" ------Degree class-----");
		// degree class 
		Degree d=new Degree();
		d.getPrerequisite();
		Bachelors bc=new Bachelors();
		bc.getPrerequisite();
	    Masters m=new Masters();
	    m.getPrerequisite();
	    
	    
	    System.out.println("------Parent class-------");
	  // Child child=new Child();
		//child.hello();
	

	    
	    
	    
	    
	    System.out.println("----Student Task-----");
	    Student sdnt=new Student();
	    sdnt.read("historical","ahmet",678);
	    sdnt.study("Ahmet", "selenium", 345);
	    sdnt.info("Ahmet", 678,"QA tester");
	    System.out.println("------Syntax Student ------");
	   Student s1=new SyntaxStudent();
	   s1.study("Mary","Java",123);
	   s1.read("novel", "Mary",123);
	   System.out.println(" -------College student-----");
	Student s2=new CollegeStudent();
	//s2.playSports();
	s2.info("Veli",378, "math");
	s2.read("religin book", "gunay", 789);
	s2.study("Adile", "java", 582);
	System.out.println("--------School Student----->");
	Student s3=new SchoolStudent();
	s3.read("educational","adile", 942);
	s3.info("Yasemin", 945, "middle ");
	//s3.music("busra");
	}} 
	    
	    

