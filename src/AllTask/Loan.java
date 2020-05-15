package AllTask;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("how much loan are you need");
		int loan=scan.nextInt();
		if(loan<=200000) {
			System.out.println("i will lend the money");
		}else {
			System.out.println("i am soory i can not lend you money");
		}
		
		scan.close();
	}

}
