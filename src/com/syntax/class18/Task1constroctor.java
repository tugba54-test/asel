package com.syntax.class18;

public class Task1constroctor {
	Task1constroctor(){
		System.out.println("I dont have any parameter");
	}
	Task1constroctor(String name){
		System.out.println("my name is "+name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1constroctor obj=new Task1constroctor();
		Task1constroctor obj1=new Task1constroctor("Java");
	}

}
