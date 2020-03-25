package com.syntax.class15;

public class CreatingMethods {
	//we want to create a method that will accept marks(90,80)
	// based on the marks it will return grade('A','B','C')
	//if grade>90--->A, if90<grade>B,if 80<grade>70---->C
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingMethods obj=new CreatingMethods();
		char grade=obj.mark(95);
		System.out.println(grade);
		System.out.println(obj.mark(89));
		System.out.println(obj.mark(70));
	   
		
		//if grade is A or B --->good job,otherwise--->study more
		if(grade=='A'  || grade=='B') {
			System.out.println("Good job");
		}else {
			System.out.println("study more");
		}

	}
	char mark(int a){
		char grade;
		if(a>90) {grade='A';
	}else if(a<=90 &&a>80) {
		grade='B';
	}
	else if( a<=80 && a>70) {
		grade='C';
	}else {
		grade='F';
	}
	return grade;	
	}

}

