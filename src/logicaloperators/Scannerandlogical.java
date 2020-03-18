package logicaloperators;

import java.util.Scanner;

public class Scannerandlogical {

	public static void main(String[] args) {
		/* take age input from a user and then based on the age print output
		 * if age from 0-3----->you are a baby
		 * if age from 4-5--->you are a kid
		 * if age from 6-12---->you are a child
		 * if age 13-19---->you are a teenagar
		 * if age from 20-64----->you are an adult
		 * if age is more or equal to 65----->you are a senior
		 */
		
		
	          //2. capture values
		Scanner input=new Scanner(System.in);
		 System.out.println("please enter your age");
		  int age=input.nextInt();
		  //3. perform verification
		  if (age>0) {
		    if (age>=1 && age<=2) {
			  System.out.println("you are a baby");
		    }else if(age>=3 && age<=5) {
			  System.out.println("you are a kid");
		    }else if(age>=6 && age <=12) {
			  System.out.println("you are a child");
		    }else if(age>=13 && age<=19) {
			  System.out.println("you are a teenager");
		    }else if(age>=20 && age<=64) {
			  System.out.println("you are an adult");
		    }else {
			  System.out.println("you are enjoying your life");
		 }
		  } else {
			     System.out.println("please enter valid age");
		  }
		  
		  
		  System.out.println("---------->task");
		  
		  System.out.println("please enter your heights");
		  int height=input.nextInt();
		   
		  if ( height>0 && height>60) {
			  System.out.println("you are short");
		  }else if(height>=60 && height<72) {
			  System.out.println("you are medium");
		  }else {
			  System.out.println("you are tall");
		  }
		     System.out.println("-------->task 2");
		     
		     System.out.println("please enter day");
		     int day=6;
		     if(day>=1 && day<=5) {
		    	 System.out.println("it is week days");
		     }else if(day>=6 && day<=7) {
		    	 System.out.println("it is weekend");
		     }else {
		    	 System.out.println("invalid day");
		     }
		     
		     if (day==1 || day==2 || day==3 || day==4 ||day==5) {
		    	 System.out.println("weekdays");
		    	 
		     }else if (day==6|| day==7) {
		    	 System.out.println(" weekwnd");
		     }else {
		    	 System.out.println("invalid day");
		     }
		

	}

}
