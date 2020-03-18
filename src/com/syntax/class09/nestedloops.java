package com.syntax.class09;

public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1; i<=3; i++) {
	System.out.println("i am outer loop");
     for(int j=1;j<=3; j++) {   
    	 System.out.println(" i am inner loop");
     }
	}
 for(int i=3; i <=9;i++) {
	 for(int j=5;j<=15; j++) {
		 System.out.println(i+"  "+j);
	 }
 }
	}
}
