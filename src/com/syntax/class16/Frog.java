package com.syntax.class16;
class ABC{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;//name=newName;(name private degilse bu sekilde yazabilirz)
		
	}
	public void setAge(int age) {
		//age=newAge;
		this.age=age;
	}
	public void setInfo(String name,int age) {
		setName(name);
		setAge(age);
	}
	
}

    public class Frog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC frog1=new ABC();
//		frog1.name="Bertie";
//		frog1.age=3;
		
		frog1.setName("Niloya");
		frog1.setName("Berti");
		frog1.setAge(3);
	System.out.println(frog1.getName());
	
		System.out.println(frog1.getAge());
		
	

	}

}
