package com.syntax.class18;

public class Constructor {
	//Cesaying invalid modifier
	//static Con
	public Constructor () {
		System.out.println("public constructor");
	}
	private Constructor (int str) {
		str=12345;
		System.out.println("my motor is "+str);
	}
	 Constructor (String text,int ab) {
	text="java";ab=18;
	System.out.println("today is "+ab+" "+text+" dersimiz");
	}
	protected Constructor (String a) {
		System.out.println("i am protected constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Constructor obj=new Constructor();
   Constructor obj1=new Constructor(12345);
   Constructor obj2=new Constructor("java",18);
   Constructor obj3=new Constructor("as");
		
		}
	}

