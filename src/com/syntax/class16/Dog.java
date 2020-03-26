package com.syntax.class16;

public class Dog {
	//instance variable
	String name,size;
	int age;
	
	//static variablesString
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static  int eyes=2;
	void displayDog() {
		System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);
		System.out.println("dog breed is "+breed+" and it has "+paws+" paws and tail "+tail) ;
	}

	public static void main(String[] args) {
	    Dog dog1=new Dog();
	    //how to acces instance variablaes-->by creating object and using referance variable
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.age=7;
		dog1.displayDog();
		//how to acces static variables
		System.out.println(Dog.breed);// class adiyla ulasiliyr
		System.out.println(paws);
		System.out.println("Dog 1 name is "+dog1.name);
		//changing value of static variable
		breed="buldogg";
		Dog dog2=new Dog();
		dog2.name="Sharik";
		dog2.size="small";
		dog2.age=2;
		System.out.println("Dog 2 name is "+dog2.name);
		dog2.displayDog();
		
		Dog dog3=new Dog();
		dog3.name="Karabas";
		dog3.size="Big";
		dog3.age=3;
		dog3.age=4;
		dog3.displayDog();
		
		System.out.println("Dog 3 name is "+dog3.name);
		

	}

}
