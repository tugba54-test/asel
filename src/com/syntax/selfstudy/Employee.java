package com.syntax.selfstudy;

public class Employee {

	

			// TODO Auto-generated method stub
			private String name;
			private String department;
			private int salary;
			
			
			public Employee(String name,String department, int salary) {
				
			
		
			 this.name=name;
			  this.department=department;
			 this.salary=salary;
			 }

			public void showInfos() {
				System.out.println("Bilgiler....");
				System.out.println("Isim:         "+this.name);
				System.out.println("Department:   "+this.department);
				System.out.println("Salary:       "+this.salary);
			}

		}


	}
	}

