package com.syntax.class22;

class Users{
	
	String name="adile";
	int num=345;
	void info(String name,int num) {
		this.name=name;
		this.num=num;
		
	}
}
class userInfo extends Users{
		String adress="2175 north state hghway";
		 public void display(String adress) {
			System.out.println(this.adress);
			System.out.println(super.name+" "+super.num);
		}
		
		
	}
	
	