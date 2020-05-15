package com.syntax.class18;

public class App {
	private String name;
	int code;
	

	public App(){
		this("Arnie",0);
	System.out.println("Constructor running!");
	

	
	}
	public App(String name) {
		System.out.println("Second constructor running");
		this.name=name;
	}
	public App(String name,int code) {
		System.out.println("third constructor running");
		this.name=name;
		this.code=code;
	}
}
