package com.syntax.class19;

public class constructor {
	constructor(){
		this(1);//always must be first line inside the constructor
		//this(1,2);CE :this is located on 2 line
		System.out.println("hi");
	}
	constructor(int x){
		this(1,2);
		System.out.println("hello");
	}
	constructor(int x,int y){
		System.out.println("how are you ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor obj =new constructor();
		constructor obj1=new constructor(23);

	}

}
