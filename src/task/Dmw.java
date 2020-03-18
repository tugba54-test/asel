package task;

import java.util.Scanner;

public class Dmw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("You will issue driver licence");
		}else {
			System.out.println("You can get a learners permit");
		}

	}
}	


