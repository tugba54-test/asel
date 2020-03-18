package com.syntax.class12;

public class Task123 {

	public static void main(String[] args) {
		// bosluklari kaldirmamizi istyor
		String text="Cocuklar parka gitmek istiyor";
		System.out.println("Return value: "+text.trim());
		String[]splittedSub=text.split(" ");
		for(int i=0;i<splittedSub.length;i++) {
			System.out.print(splittedSub[i]);
		}System.out.println();
		//how many karakter var strinde
		String day="Bu gun hava cok guzel";
		int num=day.length();
		System.out.println(num);
		
		
		

	}

}
