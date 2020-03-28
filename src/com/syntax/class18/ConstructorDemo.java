package com.syntax.class18;

public class ConstructorDemo {
	static String str="Hello";
	ConstructorDemo(){
	System.out.println("I am your constructor");
		System.out.println("I am non argument costructor");
	}// if you dont wanna costructor compiler have for you but invisible
	ConstructorDemo(String str){
		System.out.println("I am aconstructor with 1 String parameter "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am a costructor with 1 integer value=" +num);
	}
	ConstructorDemo(String str,int num){
		System.out.println("I am constractor with 2 parameters :"+str+"&"+num);
	}
	void ConstructorDemo() {
		System.out.println("I do not know who am i i am a void method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);

		ConstructorDemo obj1=new ConstructorDemo("Today is Java class");
		obj1.ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo("today is java class",18);
		

	}

}
