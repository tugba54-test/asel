package com.syntax.class07;

public class Whileloop {

	public static void main(String[] args) {
		int time=10;
		while(time<=12) {
			System.out.println("good morning");// eger time a limit vermezsek kod infinitely devam edeck
			time++;//increment operator we use for limit to loop
		}
		// how to print numbers from 1 to 50?
		int num=1;
		while(num<=50) {
		System.out.println(num);
		num++;

	}
		System.out.println("********");
		//how to print from 5 to 15 all in 1 line
		int num2=5;
		while(num2<15) {
			System.out.println(num2+"");
		num2++;
		}
		System.out.println("-----------");
		///how to print values from 10 to 1?
		int num3=10;
		while(num3>=1) {
			System.out.println(num3);
			num3--;
		}
		System.out.println("--------->");
		// how to print 1 to 50
		int num4=1;
		while(num4<=5) {
			System.out.println(num4);
			num4++;
		}
		
	}
}
