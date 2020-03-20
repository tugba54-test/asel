package com.syntax.class11;

public class arrayquiz {

	public static void main(String[] args) {
		// soru 1
		int nums[] = { 12, 15, 16, 17, 19 };

		   for (int i = nums.length-1; i >0; i--) {

		      System.out.println(nums[i]);}
		      
		      //soru2
		    //  Unresolved compilation problem: 
		 //   		Duplicate local variable i
//		      int i = 50;
//
//		      int[] a = new int[10];
//		      System.out.println(a.length);
//
//		      a = new int[100];
//		      System.out.println(a.length);
//
//		      a = new int[i];
//		      System.out.println(a.length);}
		      
		      int[] a = {12, 15, 11, 13, 9, 25};
		      int[] a2 = {12, 15, 11, 13, 9, 25};
		      int sum = 0;
		      for (int i = 0; i <a.length; i++) {
		               if (a[i] % 2== a2[i ] % 5)  {
		                        sum += i * i;
		               }
		      }
		      System.out.println("sum = " + sum);
		      int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		      for ( int index= 0 ; index < 5 ; index++ ) {
		             System.out.print( egArray[ index ] + " " );
		      }
	
		      // soru 9
		      int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		      int sum1 = 0;

		      for (int i = 0; i < 3; ++i) {

		         for (int j = 0; j < 3; ++j) {

		             sum = sum + array_variable[i][j];

		         }

		      }

		      System.out.println(sum1 / 5);
		      
		      
		      int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		      int what = array[0];

		      for (int index = 0; index < array.length; index++) {

		             if (array[index] > what) {

		                        what = array[index];

		              }

		      }

		      System.out.println(what);
		      
		      for(int i=1; i<15; i=i+3) {

		    	    System.out.print(i);}
		      //soru 13
		      System.out.println("13");
		      int x=1;

		      while(x<5) {   

		         x++;   

		         System.out.println(x);

		      }
		      
//		      int z = 0;
//		      for (int y = 0; y >= z; y++) { ///infinitive
//		          System.out.print(y + "~");
//		          System.out.println(z);
//		      }
		      int count = 0;
		      while (count++ < 10) {
		      System.out.println("Welcome to Java");
		      }
		      int y = 0;
		      for (int i = 0; i < 10; ++i) {
		      y += 1;
		      }
		      }
	}

		    

	


