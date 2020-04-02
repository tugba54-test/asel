package com.syntax.class19;

public class Book {
	Book(){
		this(1);
		System.out.println("kids");
	}
	Book(int book){
		this(1,2);
		System.out.println("about");
	}
	Book(int book,int ba){
	
		System.out.println("i read a book");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book obj=new Book();

	}

}
