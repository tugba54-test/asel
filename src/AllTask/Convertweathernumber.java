package AllTask;

import java.util.Scanner;

public class Convertweathernumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("what is temperature is your city");
		double temp=scan.nextInt();
		double c=((5*(temp-32.0))/9.0);
		
		System.out.println("The temperature is the city "+temp+" is "+c);
			
		}
		

	}


