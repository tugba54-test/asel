package com.syntax.class09;

public class Arrayintr {

	public static void main(String[] args) {
	
		int[]odd= {5,6,7,8,12,14,56};
		for(int i=0; i<=odd.length; i++) {
			if(odd[i]%2!=0) {
				System.out.println(odd[i]+"");
			}
		}
			
	/*int[]  array=new int[4];
			array[0]=10;
			array[1]=20;
			array [2]=30;
			array[3]=40;
			 // access element from an array
			System.out.println(array[2]);*/
			
			
			String carArray[]=new String[3];
			carArray[0]="BMW";
			carArray[1]="Honda";
	         carArray[2]="toyota";
	        System.out.println("i am driving "+carArray[2]);
	        
	        int[] numbers=new int[3];
	        numbers[0]=100;
	        numbers[1]=200;
	        numbers[2]=300;
	        //change value of numbers
	         numbers[1]=2000;
	         System.out.println(numbers[1]+numbers[0]);
	        
	        
	        
	        
  
   
	
   }
}
