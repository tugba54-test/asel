package com.syntax.class18;

public class Machine {
	private String name;
	
	

	public Machine(){
		this("Arnie",0);
	System.out.println("Constructor running!");
	

	
	}
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name=name;
	}
	public Machine(String name,int code) {
		System.out.println("third constructor running");
		this.name=name;
		this.code=code;
	}
}
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1=new Machine();

		//Machine machine2=new Machine("Bertie");
		//Machine machine3=new Machine("Chalky",7);
	}

}
