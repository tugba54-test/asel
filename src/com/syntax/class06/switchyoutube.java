package com.syntax.class06;

import java.util.Scanner;

public class switchyoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number from 1-4");
		int islem=scan.nextInt();
		int bakiye=1000;
		switch(islem) {
		case 1:
			System.out.println("bakiye");
		break;
		case 2:
			System.out.println("ne kadar para yatiracaksinz");
			int miktar=scan.nextInt();
			bakiye+=miktar;
		break;	
		case 3:
			System.out.println("bakiyeniz "+bakiye +"dir.");
			break;
		case 4:
			System.out.println("sistemden cikiliyor");
			break;
		default:
			System.out.println("gecersiz islem");
			
		}

	}

}
