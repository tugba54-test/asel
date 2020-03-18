package com.syntax.class08;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;int num2=5;
		for(int i=1;i<=10;i++) {
			System.out.println((num*i)+"  "+(num2*i));
		}
		for(int i=0; i<=10; i++) {
			if(i==4) {
				System.out.println("i am stopping the loop");
				break;
			}
			System.out.println("i am inside the loops");
			System.out.println(i);
		}
		for(int i=0; i<=10; i++) {
			if(i==4|| i==6) {
				System.out.println("i am skipping iteration");
				continue;
			}
			System.out.println("i am inside the loops");
			System.out.println(i);
		}
		for(int i=0; i<=20; i++) {
			if(i==5|| i==6||i==7) {
				System.out.println("i am skipping iteration");
				continue;
			}System.out.print(i+"   ");
		}System.out.println();
		for(int i=0; i<=100; i++) {
			if(i>=35 && i<=55) {
				System.out.println("i am skipping iteration");
				continue;
			}System.out.println(i);
	}
	}
}
