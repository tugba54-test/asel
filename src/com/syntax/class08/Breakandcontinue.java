package com.syntax.class08;

public class Breakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("i am stopping to loop");
				break;
			}
			System.out.println("i am inside the loop");
			System.out.println(i);
		}
      System.out.println("---outside-------->");
      for(int y=1; y<=10;y++) {
    	  if(y==4) {
    		  System.out.println("i am skipping 4 iteration");//4 u atliyr
    		  continue;
    	  }
    	  System.out.println("i am iside the loops");
    	  System.out.println(y);
      }
      for(int i=1;i<21;i++) {
    	  if(i==5 || i==6 || i==7) {
    		  continue;
    	  }
    	  System.out.println(i);
      }
      for(int i=1; i<=100; i++) {
    	  if(i>=35 && i<=55) {
    		  continue;
    	  } 
    	  System.out.println(i);
      }
	}

}
