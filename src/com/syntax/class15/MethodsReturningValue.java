package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		// create a String and based on the length of the STRING
		//we define whether String is short or long
		String str="Hello my friend";
		int length=str.length();
		System.out.println(length);
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		
		//compare two numbers and then we will identify whether largest number is even or odd
		
		MethodsLarge l=new MethodsLarge();
		//int num=l.larger(23,78);CE since is larger does not return any value
		
		MethodsReturningValue newl=new MethodsReturningValue();
		int num= newl.largest(25,67);
		boolean flag = newl.isOdd(num);
		System.out.println("Largest number " + num + " is odd number:" + flag);
		

	}
	//cerate a method thar returns largest number from 2 given numbers
	int largest(int a,int b) {
		int largest;
		if(a>b) {
			largest=a;
		
		}else {
			largest=b;
		}
		return largest;
	}
	boolean isOdd (int num) {
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		return isOdd;
	}

}
