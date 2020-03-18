package com.syntax.class06;

public class Homewrkorand {

	public static void main(String[] args) {
		int  score=56;
		String grade;
		if(score>=0 && score<=50) {
			grade="F";
			
		} else if (score>=51 && score<=70){
			grade="C";
		}else if (score>=71 && score<=90){
			grade="B";
		}else {
			grade="A";
		}
		System.out.println("your grade is "+ grade);

	}

}
