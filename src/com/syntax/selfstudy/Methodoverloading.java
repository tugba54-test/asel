package com.syntax.selfstudy;

public class Methodoverloading {
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplamlari "+(a+b+c));
	}
	public static void cikarma(int a,int b) {
		System.out.println("Cikarma "+(a-b));
	}
	public static void score(String name,int score) {
		System.out.println(name+ " isimli oyuncunun puani : "+score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toplama(3,4,5);
		cikarma(10,5);
		score("ahmet",90);

	}

}
