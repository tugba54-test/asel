package Nisan30Map;

public class Person {
	String name,lastName;
	int age,salary;
	
	 Person(String name,String lastName,int age, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}

	 
	 void printUserDetails() {
		 System.out.println("Name: "+name+"/ln"+"Last Name: "+lastName);
		 System.out.println("Age is : "+age+" Salary is : "+salary);
	 }
}
