package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam  extends Employee{
	public static void main(String[] args) {
		WaterfallTeam wteam=new WaterfallTeam();
		wteam.empNumber=456;
		wteam.company="Syntax";//protected variables is visible to the child
		//class in the different// default is not visible
		//wteam.salary-->default is not visible
		
		WaterfallTeam wteam1=new WaterfallTeam();
		Employee.company="Syntax";
		wteam1.empNumber=124;// protected variables is visible to the child class in different Package
		//wteam.salary // CE: default is not visible
		
		
	}

}
