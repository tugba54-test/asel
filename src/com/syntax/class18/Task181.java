package com.syntax.class18;

public class Task181 {
	 static String name,lastname;
	int age;
static double average;
	 Task181(String sname,int sage){
		 name=sname;
		 age=sage;
		 System.out.println("my name is "+name+" my age is "+age);
	 }
protected Task181(String bname,String blastname,int bage){
	name=bname;
	age=bage;
	lastname=blastname;
	System.out.println("my name is "+name+"my last name is "+lastname+" my age is "+age);
}
Task181(String bname,String blastname,double baverage) {
	name=bname;
	lastname=blastname;
	average=baverage;
	System.out.println("my name is "+name+"my last name is "+lastname+" my average is "+average);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
