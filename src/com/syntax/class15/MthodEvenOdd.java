package com.syntax.class15;

public class MthodEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MthodEvenOdd num=new  MthodEvenOdd();
		 num.even(45);

	}
	void even (int a) {
		if(a%2==0) {
			System.out.println(a+" is a even number");
		}else {
			System.out.println(a+" is a odd number");
		}
	}

}
