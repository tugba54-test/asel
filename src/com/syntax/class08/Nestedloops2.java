package com.syntax.class08;

public class nestedloops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=3; i++) {
			System.out.println("Hello");
			for(int y=3; y<=3;y++) {
				System.out.println("Bye");
			}
		}
		for (int i=1;i<=3; i++) {
			System.out.print(i+"Hello");
			System.out.println();
			for(int y=1; y<=3;y++) {
				System.out.print(y+"Bye");
				System.out.println();
			}
		}
	}

}
