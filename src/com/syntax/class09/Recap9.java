package com.syntax.class09;
 public class Recap9{
	 public static void main(String[] args) {
		 //0 dan 99 a kadar sayi yazdirma
		 for(int i=1; i<=9;i++) {
			 for(int j=0; j<=9;j++  ) {
				 System.out.println(i+""+j);
			 }
		 }
		 //saati yazdirma
	
		 for(int i=0; i<24;i++) {
			
			 
			 for(int y=0;y<60;y++) {
				 
				 
				 if(y<10) {
					System.out.println(i+":0"+y);
				 }else
				 System.out.println(i+":"+y);
			 }
			 }
		 System.out.println("--------------->");
		 // using nested loops to print car odometer
		 for(int i=0;i <=9;i++) {
			 for(int y=0;y<=9;y++) {
				 for(int z=0;z<=9; z++) {
					 for(int x=0; x<=9; x++) { 
						 System.out.println(i+""+y+""+z+""+x);
					 }
				 }
			 }
		 }
		 
	 
	 
	 }
			 }
