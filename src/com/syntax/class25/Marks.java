package com.syntax.class25;

public abstract class Marks {
//	We have to calculate the average of marks obtained in three subjects by student A and by student B. 
//	Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks.
//	Provide implementation of abstract method in classes ‘A’ and ‘B’. 
//	The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
//	Test your code
	int math;
	int history;
	int science;
	int literature;
	int countSubject;
	 Marks(int math,int history,int science){
		 this.history=history;
		 countSubject++;

		 this.math=math;
		 countSubject++;

		 this.science=science;
		 countSubject++;
	 }
	 Marks(int math,int history,int science,int literature){
		 this.history=history;
		 countSubject++;

		 this.literature=literature;
		 countSubject++;

		 this.math=math;
		 countSubject++;

		 this.science=science;
		 countSubject++;
	 }
	 abstract void getPercentage();

}
class A extends Marks{

	A(int math, int history, int science) {
		super(math, history, science);
	}

	@Override
	void getPercentage() {
		double sum=(math+history+science);
		double average=sum/super.countSubject;
		System.out.println("the percentage is % "+average);
	
		
	}
	
}
class B extends Marks{

	B(int math, int history, int science,int literature ) {
		
		super(math, history, science,literature);
	}

	@Override
	void getPercentage() {
		double average=(math+history+science+literature)/super.countSubject;
		System.out.println("the percentage is % "+average);
		
		
	}
	
}