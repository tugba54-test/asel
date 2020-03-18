package com.syntax.class08;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			//System.out.print(i);
			for(int y=1; y<=3;y++) {
				
				if( y==2) {
					System.out.println("skip the 2");
					continue;
			}
				System.out.println(i+"   "+y);
		
			
			
			}
		}
            for(int i=1; i<=3; i++) {
            	System.out.println("hello");
            	for(int y=1; y<=3; y++) {
            		System.out.println("bye");
            	}
            }
	}

}
