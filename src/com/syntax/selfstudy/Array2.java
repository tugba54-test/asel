package com.syntax.selfstudy;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] numbers= {1,2,3,4,5,6,7};
   System.out.println(numbers.length);//array in icinde kac sayi var
   System.out.println(numbers[2]);
   for( int i:numbers) {
	   System.out.print(i+" ");
	   System.out.println("----------->");
   } for(int x=0;x<6;x++) {
	   System.out.print(numbers[x]+" ");
   }
	}

}
