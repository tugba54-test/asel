package AllTask;

import java.util.Scanner;

public class Mortage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("what is the rate ");
		double rate = input.nextDouble();

		if (rate < 4.5) {
			System.out.println("i am decided to buy a house ");
			System.out.println("What is the Price");
			double price = input.nextDouble();
			if (price > 200000) {
				System.out.println("i need to take a loan");
			} else {
				System.out.println("paying with cash");
			}

		} else {
			System.out.println("not going to buy house ");
		}
input.close();
	}

}
