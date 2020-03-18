package com.syntax.class08;

public class Sumevenforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sume=0;
		int sumo=0;
		int grand=0;
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
			
				sume+=i;
			}else {
				sumo+=i;
				 grand=sumo+sume;
			}

	}
		System.out.println("total even is " +sume);
	System.out.println("total odd id "+sumo);

	System.out.println("grand total is"+ grand);
}
	
	
	}

