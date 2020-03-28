package com.syntax.class18;

public class MethodOverloading {
	public static void toplama(int a,int b,int c) {
		System.out.println("toplamlari:"+(a+b+c));
	}
	public static void toplama(int a,int b) {
		System.out.println("toplamlari:"+(a+b));
	}
public static void skorHsp(String name,int score) {
	System.out.println(name+" isimli oyuncunun puani: "+score);
}
public static void skorHsp(int score) {
	System.out.println(" isimsiz  oyuncunun puani: "+score);
}
	public static void main(String[] args) {
		toplama(3,4,5);
		toplama(10,20);
		skorHsp("murat",90);
		skorHsp(456);
		

	}

}
