package com.syntax.class10;

public abstract class Task102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {90,87,65,54,34,21,56};
		int  sum=0;
		int sum1=0;
		for(int i:num) {
			sum=sum+i;
		}System.out.println("sum "+sum);
		
		for(int i=0;i<num.length;i++) {
		sum1=sum1+num[i];
		}
		System.out.println(sum);
	}
}

