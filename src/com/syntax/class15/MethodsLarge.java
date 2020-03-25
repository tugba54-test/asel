package com.syntax.class15;

public class MethodsLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsLarge l=new MethodsLarge();
		 l.larger(50,34);
		 l.larger(90,50);
		 l.larger(50, 75);
		

	}
 void larger(int a,int b) {
	 if(a>b) {
		 System.out.println(a+" is the larger than "+b);
	 }else {
		 System.out.println(b+" is the larger than "+a);
	 }
	 
 }
 int a;
 int b;
}
