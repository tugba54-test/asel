package com.syntax.class26;

class Encapsulation
{
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("");
		System.out.println(emp.getName());
		Employee emp1=new Employee();
		emp1.setName("tugba");
		System.out.println(emp.getName());
		
	}
	
}