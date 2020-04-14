package com.syntax.class22;

public class OverloadingMain {
	static String str="syntax";
	public static void main(int [] args) {
		System.out.println("Method with int array arguments");

	}
	public static void main(String str) {
		System.out.println("Method with String  arguments"+str);

	}
	public static void main(String args,String name) {
		System.out.println("Method with 2 String arguments");

	}
	public static void main(String args,int num) {
		System.out.println("Method with String and int arguments");

	}

	public static void main(String[] args) {
		System.out.println("Method with String array arguments");
		OverloadingMain.main("str");
		main("hi","hello");
		main("hi",5);
		
		//int[] arr=new int[2];



	}

}
