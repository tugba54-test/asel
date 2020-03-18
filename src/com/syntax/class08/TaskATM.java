package com.syntax.class08;

import java.util.Scanner;

public class TaskATM {

	public static void main(String[] args) {
		// while dongusyle atm yapmaya calisma
		Scanner scan=new Scanner (System.in);
		
		int islem;
		String result;
		
		do{
			System.out.println("lutfen yapacaginiz islemi giriniz");
			islem=scan.nextInt();
			switch(islem) {
			case 1:
				result="bakiye ogrenme";
				break;
			case 2:
				result="para cekme";
				break;
			case 3:
				result="para yatirma";
				break;
			default:
				result="cikis";
			}
			System.out.println("right now you are doing "+result+" yapiyorsunz");
		}while(islem!=4);
			
		}

	}


