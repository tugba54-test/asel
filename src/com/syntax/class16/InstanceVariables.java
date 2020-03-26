package com.syntax.class16;

public class InstanceVariables {
	String name="John";//instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Yunus";
		System.out.println(name);//we are accessing the local variable 
		
		//how can we acces instance variables we need to have object
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		
		//changing the instant varable name
		obj.name="ali";
		name="Farid";
		System.out.println(name);
		System.out.println(obj.name);
		

	}

}
