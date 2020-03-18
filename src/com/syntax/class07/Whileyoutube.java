package com.syntax.class07;

import java.util.Scanner;

public class Whileyoutube {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// while(kosul){   islem islem    }dongu yapiyr efektif 
	
		System.out.println("lutfen bir sayi girinz");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		while(sayi>1) {
		faktoriyel=faktoriyel*sayi;
		System.out.println("faktoriyel "+faktoriyel+"sayi "+sayi);
		sayi--;
		}
		System.out.println("faktoriyel "+faktoriyel);
		
		
	}
 
}
