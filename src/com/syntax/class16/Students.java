package com.syntax.class16;

public class Students {
	String name;
    int id;
    static int num;
    Students(String name,int id){
    	this.name=name;
    	this.id=id;
    }
void display() {
	num++;
	System.out.println("my name is "+name+" my id is "+id+" and my student number "+num);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students("Ahmet",102);
		Students s2=new Students("ali",105);
		Students s3=new Students("Abuzettin",109);
   s1.display();
   s2.display();
   s3.display();
	}

}
