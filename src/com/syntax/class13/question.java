package com.syntax.class13;

public class question {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		a = a + b;// a=30
		b = a - b;// b=10
		a = a - b;// a=20
		System.out.println("the value of a= " + a);
		System.out.println("the value of b= " + b);

		String str1 = "Day";
		String str2 = "night";
		str1 = str1 + str2;// daynight
		str2 = str1.substring(0, 3);// day(substring(0,str1.length()-str2.length())
		str1 = str1.substring(3);//str2.length
		System.out.println("the value of str1= " + str1);
		System.out.println("the value of str2= " + str2);
		
		/*this code is shorter   str1 = str1+str2;
		str2 = str1.replace(str2, "");
		str1 = str1.replace(str2, "");*/

	}

}
