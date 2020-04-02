package com.syntax.class19;

public class Contact {
	public Contact() {
		this("hi");
		System.out.println("i am non argument");
	}
	public Contact(String name) {
		this("hi","ahmet");
		System.out.println("how are you");
	}
	public Contact(String s,String ab) {
		
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Contact obj=new Contact();

	}

}
