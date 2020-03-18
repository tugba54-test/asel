package com.syntax.class12;

public class Task124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how many centences
				String cumle="Is it Saturday? Is it raining? Do we have a Java class today?";
						 
	
				String[] array=cumle.split("\\?");
				System.out.println(array.length);
			for(int i=0;i<array.length;i++) {					
				System.out.println(array[i]+" ");
			}
			
	
				

	}

}
