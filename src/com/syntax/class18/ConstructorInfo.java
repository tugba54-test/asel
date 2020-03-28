package com.syntax.class18;

public class ConstructorInfo {
	
	
	
	
	//to create a constructor: 1.no return type(not even void)
	                           // 2. name musr be same as class name
	ConstructorInfo(){
		System.out.println("i am a constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInfo obj=new ConstructorInfo();//constructor call
		System.out.println("Code after construction");
   obj.hello();//method call
	}
	void hello() {
		System.out.println("Hello class");
	}

}
