package com.syntax.class15;

public class Calculator {
	// define methods to calculate add,sub,div,mult
	void add(int a,int b) {
		
		System.out.println(a+b);
	}void sub(int a,int b){
		
		System.out.println(a-b);
	}void div(double  a,double b){
		
		System.out.println(a/b);
	}
	// created a method with name mult that accept 2
	//parameters of integer type
	
	void mult(){
		int a=6;
		int b=9;
		System.out.println(a*b);
	}
	public static void main(String [] args) {
	Calculator cal=new Calculator();
	cal.add(100,200);
	cal.sub(1000,300);
	cal.div(9,3);
	cal.mult();
	cal.add(10,200);
	cal.sub(450,300);
	cal.div(30,3);
	

}
}