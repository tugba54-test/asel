package com.syntax.class09;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5; b++) {
				System.out.print("*");
			}
		}
		System.out.println("---printing pattern using nested loops");
		for(int i=1; i<=4; i++) {
			for(int y=1;y<=5; y++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("10 *10 pattern");
		for(int i=1;i<=10;i++) {
			for(int y=10;y>=1;y--) {
				System.out.print("*"+i);
			}System.out.println();
			
		}
		System.out.println("------------5 *10 pattern");
		//
				for(int i=1;i<=5;i++) {
					for(int y=10;y>=1;y--) {
						System.out.print("*");
					}System.out.println();
	}

}
}