package task;

import java.util.Scanner;

public class Salaryifnest {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int year=abc.nextInt();
		
		
		if(year>=5) {
			System.out.println("you are eligible for the bonus");
			System.out.println("please enter your salary");
			int salary=abc.nextInt();
			if(salary>50000) {
				System.out.println("your bonus is 5000");
			}else {
				System.out.println("yor bonus is 3000");
			}
		}else {
			System.out.println("you are not eligible for the bonus");
		}
		


		
	}

}
