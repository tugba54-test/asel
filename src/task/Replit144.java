package task;

public class Replit144  {
	
		String name;
		String  lastName;
		int age;
		}
		class Employee extends Replit144 {
			 int salary;
			  Employee(String name,String lastName,int age,int salary){
			    this.name=name;
			    this.lastName=lastName;
			    this.age=age;
			    this.salary=salary;}
			  
			  void display1(){
			  System.out.println(name+" "+lastName+" "+age+" "+salary);
			}
			}
			class Student extends Employee{
			 int grade;
			  Student(String name,String lastName,int age,int grade){
			    this.name=name;
			    this.lastName=lastName;
			    this.age=age;
			    this.grade=grade;
			  }
			  void display2(){
			  System.out.println(name+" "+lastName+" "+age+" "+grade);
			}
			  
			}
			class Retiree extends Student{
			String seniorActivity;
			 Retiree(String name,String lastName,int age,String seniorActivity){
			    this.name=name;
			    this.lastName=lastName;
			    this.age=age;
			    this.seniorActivity=seniorActivity;}
			void display3(){
			  System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
			}
			}
		}
