package com.syntax.class04;

public class Nestelse {

	public static void main(String[] args) {
		//*if student completed a quiz we wil check for a score
		
		
		boolean quiz=true;
		int score =50;
		
		if (quiz) {
			System.out.println("let's check your score"); 
			if(score>90) {
				System.out.println("great job you study a lot");
			}else if (score>80) {
				System.out.println("well done");
			}else if(score>70) {
				System.out.println("you could done better");
			}else {
				System.out.println("you failed");
			}
		}else {
			System.out.println("please do homework on time");
		}
		
		

	}

}
