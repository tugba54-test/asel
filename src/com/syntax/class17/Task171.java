package com.syntax.class17;

public class Task171 {
	static int array(int [] b) {
		int sum=0;
		for(int i=0; i<b.length;i++) {
			sum+=b[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// create a method that will accept an array as parameters and will 
//		return a sum of all elements from that array. 
//		Method should be visibly only within same package and accessible
//		by the creating an instance of the class.
		
		 Task171  obj=new  Task171();
		 int [] s= {23,45,67,89};
		int arr=Task171.array(s);
		System.out.println(arr);

	}

}
