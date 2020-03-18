package com.syntax.class07;

public class forloop {

	public static void main(String[] args) {
		// good morning 5 times
		for (int c=1; c<6; c++) {
			System.out.println("good morning");
		}
   for(int a=1; a<=10; a++) {
   System.out.println(a);
	}
   for(int a=10; a>=1; a--) {
	   System.out.println(a);
   } for(int a=0; a<=50; a+=5) {
	   System.out.println(a);
   }
   int sum=0;
   for(int a=1;a<5; a++) {
	   sum=sum+a;
	   System.out.println("value of the sum " +sum);
	   
   }
   
   for(int a=0,b=3; a<10 || b<6; a++ ,b++) {
	   System.out.println("a="+a+" b="+ b);
   }
   for (int i =0;i<5; i++) {
	   for(int b=2;b<9; b++) {
	   System.out.println("i nin degeri "+i+"b nin degeri "+b);
   }
   

}
}