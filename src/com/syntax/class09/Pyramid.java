package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1; r<=4; r++) {
			for (int c=1; c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
       for(int r=4; r>=1; r--) {
    	   for(int y=4; y>=r; y--)
    		   System.out.print("*");
       }
       System.out.println("Printing triangle of numbers------");
      
       for(int r=1; r<=4; r++) {
			for (int c=1; c<=r;c++) {
				System.out.print(r+"");
			}
			System.out.println();
		} 
      
	}

}
