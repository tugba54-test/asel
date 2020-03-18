package REply;

import java.util.Scanner;

public class Reply42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan=new Scanner(System.in);
		    System.out.println("enter the roll number of the Child");
		    int number=scan.nextInt();
		    String output;
		    
		    switch (number){
		      case 101:
		        output="Student name:Ramesh";
		        break;
		      case 102:
		        output="Student name:Mahesh";
		        break;
		      case 103:
		        output="Student name:Mukesh";
		        break;
		      default:
		        output="Not found Student name:in Class";
		        
		    }
		    System.out.println(output);
		 }
		}

	


