package com.syntax.class19;

public class Teacher {
	String object,name;
	int year;
	
	Teacher(){
		this("hi");
		System.out.println("kolesi olurum");
	}
	Teacher(String a){
		this("hi","hello");
		System.out.println("ogretenin kirk yil");
	}
	Teacher(String str,String ab){
		System.out.println("bana bir harf");
	}
	void display() {
		System.out.println("my name is" +name+" my object is "+object+" and I am "
				+ "working "+year+" years ");
	}
	
	void teach() {
		System.out.println("they teach different object");
	}
	void test() {
		System.out.println("they are testing students");
	}
	void study() {
		System.out.println("they are study about "+object);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
