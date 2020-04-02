package com.syntax.class19;

public class Students {
	String name,adress;
	Students(String sname,String Sadress){
		this.name=sname;
		this.adress=Sadress;
	}
	public void displayinfo() {
		System.out.println("Student name is "+name+" adress "
				+ "is "+adress);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students("hasan","2175 north "
				+ "state highway 360");
		obj.displayinfo();

	}

}
