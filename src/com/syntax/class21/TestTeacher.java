package com.syntax.class21;

public class TestTeacher {
	public static void main(String[] args) {

		MathTeacher mt=new MathTeacher("Brian", "Quisbert");
		System.out.println(mt.name);
		
		MathTeacher mt1=new MathTeacher("Sarmed", "Halabi");
		System.out.println(mt1.name+" "+mt1.lastName);
		
		JavaTeacher jt=new JavaTeacher("Anna", "Smith", "Java 8");
		System.out.println(jt.name+" "+jt.lastName+" "+" "+jt.certifications);
	}

}
