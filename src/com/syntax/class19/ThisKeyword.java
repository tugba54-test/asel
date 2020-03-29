package com.syntax.class19;

public class ThisKeyword {
	int a;
	int b;
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	public ThisKeyword(int a,int b) {
		this.a=a;this.b=b;
	}
	public void sum(int a,int b) {
		//sum of which variables am i calculating?
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instance variables"+(this.a+this.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword  obj=new ThisKeyword ( 10,20);
		obj.sum(100, 200);
		ThisKeyword  obj1=new ThisKeyword ();
		obj1.sum(23,45);
 
	}

}
