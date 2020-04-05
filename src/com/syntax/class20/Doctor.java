package com.syntax.class20;

public class Doctor {
	int ID;
	String name;
//	public Doctor(int ID,String name) {
//		this.name=name;
//		this.ID=ID;
//	}

}
 class Dentist extends Doctor{
	 String cert;
	 Dentist(int ID,String name,String cert){
		 //compiler will try to make 
		 //call to parent class constructor super();
		 super.ID=ID;
		 super.name=name;
		 this.cert=cert;
	 }
	
}