package com.syntax.class13;

public class Question3 {

	public static void main(String[] args) {
		// write ten fibunocci numbers
        int f1,f2,f3;
		 f1=0; f2=1;
	
		for(int i=0;i<10;i++) {
			System.out.println(f1+" ");	
			f3=f1+f2;
			
			f1=f2;
			f3=f2;
					
					
			
		}
		int input=10;
        int n1=0;
        int n2=1;
        int sum=0;
        
        System.out.print(n1+"   "+n2);
        for(int i=1;i<=input; i++) {
        	
        	
           System.out.print("   "+sum);
           sum=n1+n2;
           
           n1=n2;
           n2=sum;
        }System.out.println();
        

	}

}
