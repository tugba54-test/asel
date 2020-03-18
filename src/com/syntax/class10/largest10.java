package com.syntax.class10;

public class largest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] nums= {200,30,-1,900,56,3000};
		int largest=nums[0];
		for(int i=1; i<nums.length;i++) {
			if(nums[i]>largest) {
				largest= nums[i];
		
			}
		
		}System.out.println("largest number is = "+largest);

  int [] array= {56,788,8865,44234};
  int largest1 = 0 ;
  for(int i=1;i<array.length;i++){
	  if(array[i]>largest1) {
		  largest1=array[i];
	  }
  }System.out.println("large1 = "+largest1);
	}

}
