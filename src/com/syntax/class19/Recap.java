package com.syntax.class19;

public class Recap {
	Recap(){
		System.out.println("Constructor with no arguments");
	}
     Recap (int num){
    	System.out.println("Constructor with 1 Parameter"); 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recap obj=new Recap(2);
		Recap obj1=new Recap();

	}

}
