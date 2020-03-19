package com.syntax.class10;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {23,45,67,89,345,876,921};
		int largest = 0;
		int slargest = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];
		
				}
				
			}
		System.out.println(largest);
		for(int i=1;i<=6;i++) {
			for(int y=6;y>=1;y--) {
				System.out.print(i+"  ");
			}System.out.println();
		}
		}


	}


