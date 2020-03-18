package com.syntax.class08;

public class demoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=20; i++) {
			if(i==13) {
				continue;
			}System.out.println("happy birthday you are "+i);
		}
		for(int i=15; i<=35; i++) {
			if(i%6==0) {
				continue;
			}
			System.out.println("first"+i);
			
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println("second "+i);
			
		if(i%2!=0 || i%3!=0) {
			System.out.println("third "+i);
		}
		
		}
	}

}
