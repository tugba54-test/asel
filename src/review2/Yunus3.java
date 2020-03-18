package review2;

import java.util.Scanner;

public class Yunus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("enter a day");
		String day=input.nextLine();
		String fruit;
		switch(day) {
		case "monday":
			fruit="banana";
			break;
		case "tuesday":
			fruit="orange";
			break;
		case "wednesday":
			fruit="grape";
			break;
		case "thursday":
			fruit="berries";
			break;
		case "friday":
			fruit="apple";
			break;
		default:
			fruit="popcorn";
			break;
		}
		System.out.println(fruit);
		
		

	}

}
