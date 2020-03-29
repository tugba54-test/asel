package com.syntax.class18;

public class Students {
	static String name;
	int marka,markb,markc;

	
	Students (String sname,int smark,int smark2,int smark3){
		name=sname;
		marka=smark;
		markb=smark2;
		markc=smark3;
		int mark=marka+markb+markc;
		int average=(marka+markb+markc)/3;
		System.out.println("my name is "+name+" my mark is "+mark+" my average is "+average);
		
	}
	public int average() {
		int total=marka +markb+markc;
		int average=total/3;
		return average;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students("ahmet",90,100,95);
		System.out.println("my name is "+name+" my average is "+obj.average());
		Students obj1=new Students("mehmet",89,97,99);
		System.out.println("my name is "+name+" my average is "+obj1.average());

	}

}
