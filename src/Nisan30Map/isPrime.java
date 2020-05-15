package Nisan30Map;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// find all prime numbers between 2 and 100
		
		int a;
		int b;
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter begin index");
		a=scan.nextInt();
		
		System.out.println("Please enter ending index");
		b=scan.nextInt();
		
	//code redundancy olmamasi icin
		if(b<a) {
			a=a+b;
			b=a-b;
			a=a-b;
			
		}
			
		for(int i=a; i<b; i++) {
			boolean isPrime=true;
			for(int j=a+1;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
		
		
//		negatifse a dan b ye 
//		b den a ya yada swapt number yapabiliriz
//		

	}

}
