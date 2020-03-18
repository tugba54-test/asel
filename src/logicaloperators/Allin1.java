package logicaloperators;

import java.util.Scanner;

public class Allin1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*ask user if there is a sale
		 * if no sale ----->not going shopping
		 * if sale ask the price
		 * apply for discount and calculate final price
		 * 
		 * less than 20---->apply 10%
		 * between 20 and 100--->20%
		 * between 100 and 500-->30%
		 * more than 500---->50%
		 * 
		 * after discount___the price of the item reduced from ____to____
		 */
		Scanner atl=new Scanner(System.in);
		String sale = null;
		double price;
		double discount;
		
	
		System.out.println("is there any sale");
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("please enter your price");
			price=atl.nextDouble();
			if(price<=20) {
				discount=price*0.1;
				
			}else if(price>=21 && price<=100) {
				discount=price*0.2;
			}else if(price>=101 && price<=500) {
				discount=price*0.3;
			}else {
				discount=price*0.5;
			}
			System.out.println("after discount "+discount+" the price of the item reduced from "+price+"to"+(price-discount));
		}else {
			System.out.println("not going to shopping");
		}
	}
}	
				
		
		
		

		
		


	


