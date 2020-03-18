package com.syntax.class11;

public class Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {
				{1,2,3,4,5},
				{6,7,8,9},
				{10,11,12,13}
		};
		for(int[] num:numbers) {
			for(int n:num) {
				System.out.print(n+" ");
			}System.out.println();
		}

	}

}
