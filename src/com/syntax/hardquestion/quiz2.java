package com.syntax.hardquestion;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}
		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");
		}
		int array_variable1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable1[i][j];

		   }

		}

		System.out.println(sum / 5);
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		for(int i=1; i<15; i=i+3) {

		    System.out.println(i);

		}
		int x=1;

		while(x<5) {   

		   x++;   

		   System.out.print(x);

		}System.out.println();

	     int y = 0;
	     for (int i = 0; i < 10; ++i) {
	     y += 1;
	     }System.out.println(y);
	     
	     for(int i = 0; i <= 5; i++ ) {
	    	   System.out.println("i = " + i );
	    	}

	    	System.out.println("i after the loop = " + i );
		}}

	


		
	

		

		
		


		