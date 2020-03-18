package com.syntax.selfstudy;
public class inheritance {

public static void main(String[] args) {
	// KALITIM
	Employee employee=new Employee("mustafa Murat","Bilisim departmani", 300) {
	employee.showInfos();
	Manager manager=new Manager("Mustafa murat coskun","Bilisim",4000);
	manager.showInfos();
	}	
}
}