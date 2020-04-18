package com.syntax.class17;

public class Employee {
	public static String title;
	public String name;//accesible eveywhere
	protected String Lastnm;// accessible within same package
	double salary;// this is default (access same package) 
	 private long ssn;//accessible ONLY within same class
	 
	   public static void method1() {
		 System.out.println("I am public method");
	 }
	   protected void method2() {
		   System.out.println("I am protected method ");
	   }
	   
	   void method3() {
		   System.out.println("I am default method");
	   }
	  private void method4() {
		  System.out.println("I am a private method");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.name="ALI";
		emp.Lastnm="eker";
		emp.salary=90000;
		emp.ssn=908776767;
		//accessing all methods
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
		

	}

}
