package com.syntax.class04;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean todayclass=false;
		boolean flag=true;
		
		if(flag) {
			System.out.println("hello");
			if (todayclass) {
				System.out.println("hello friends");
			}else {
				System.out.println("hello family");
			}
		}else {
			System.out.println("bye");
		}
		System.out.println("i am outside of if condition");

	}

}
