package task;

import java.util.Scanner;

public class Temperatureifscan {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("please enter your city name");
		String name=abc.nextLine();
		System.out.println("please enter weather temperature");
		float temp=abc.nextFloat();
		float celcius=((temp-32)*5/9) ;
		
		System.out.println("The temperature is the city "+ name +" is "+celcius);

	}

}
