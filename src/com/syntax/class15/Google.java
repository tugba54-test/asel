package com.syntax.class15;

public class Google {
	
	//define features such as empid,name,salary,title
	//define a behavior working,get paid, attending meetings

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google r=new Google();
		r.name="Jhon";
		r.lastName="Smith";
		r.title="engineer";
		r.emId=1234;
		r.salary=300000;
		 r.working();
		 r.getPaid();
		 r.meetingA();
		 
		 Google r1=new Google();
			r1.name="seyma";
			r1.lastName="atasoy";
			r1.title="QA engineer";
			r1.emId=123;
			r1.salary=30000;
			 r1.working();
			 r1.getPaid();
			 r1.meetingA();
			 
		 
		

	}
	int emId,salary;
	String name,lastName,title;
	void working() {
		System.out.println(title+" is working");
	}void getPaid(){
		System.out.println(name+" is getting paid "+salary);
	}void meetingA(){
		System.out.println(name+" attending meetings");
	}

}
