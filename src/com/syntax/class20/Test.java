package com.syntax.class20;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.empNumber=1234;
emp.company="Syntax";
emp.salary=300000;
emp.getPaid();
emp.work();
//features accesible from immediate parent
ProductOwner po=new ProductOwner();
po.empNumber=123;
po.salary=150000;
po.ceremonies="Sprint Grooming,Sprint Planning,Sprint Demo,Dailiy stand up";
po.attendMeetings();
//accessing own features 
po.prioritizeBacklog();
po.work();












	}

}
