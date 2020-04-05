package com.syntax.class22;

public class Contactor  extends Employee{
	int HourlyRate;
	void GetPaid() {
		System.out.println("Employee gets paid "+HourlyRate);
	}

}
class FullTime extends Employee{
	void GetPaid() {
		System.out.println("Employee gets paid "+salary);
	}
	
}
class PartTime extends Employee{
	void GetPaid() {
		System.out.println("Employee gets paid "+salary);
	}
	
}