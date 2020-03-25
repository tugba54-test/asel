package com.syntax.class16;
class person{
	
	String name;
	int age;
//class can contain 1-data 2.methods(subroutines)	

void speak(){
	for(int i=0;i<3;i++) {
	System.out.println("my name is "+name+" i am "+age+" years old can speak");

}

}
void sayHello() {
	System.out.println( "Hello there");
}

int retirement() {
	int left=65-age;
	System.out.println(left);
	
	return left;
}
int getAge() {
	return age;
}
String getName() {
	return name;
}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1=new person();
		person1.name="Joe bloggs";
		person1.age=37;
		
		person person2=new person();
		person2.name="Jhon bloggs";
		person2.age=54;
		
		System.out.println(person2.name+person2.age);
			person1.speak();
			person2.speak();
			person1.sayHello();
			person1.retirement();
            int years=person2.retirement();
            System.out.println("years till retirements "+years);
            int Age=person1.getAge();
            String  name=person1.getName();
            System.out.println(name+" "+Age);
            
			
	}

}
