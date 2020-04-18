package com.syntax.class17;

public class AccessingMmberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.name="faisal";
		emp.Lastnm="saki";
		emp.salary=10000;
		//emp.ssn=36738;CE field ssn private is not visible 
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();Ce method4is not visible

	}

}
