package com.syntax.class16;

public class Company {
	String name;
	int salary;
	int id;

	 public static int num;
	Company(String name,int salary,int id){
		this.name=name;
		this.salary=salary;
		this.id=id;
		
	}

	void display() {
		num++;
		System.out.println("my name is " + name + "my id is " + id + " my s"
				+ "alary is " + salary+" my number is "+num );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company em1 = new Company("ahmet", 7000, 123);
		Company em2 = new Company("mehmet", 7500, 129);
		Company em3 = new Company("ahmet", 7950, 12);
		em1.display();
		em2.display();
		em3.display();

	}
	}

