package AllTask;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) throws Exception{

     Scanner input=new Scanner (System.in);
     System.out.println("do you have diploma");
     String diploma=input.nextLine();
     if(diploma.equalsIgnoreCase("yes")) {
    	 System.out.println("Congrulations");
    	Thread.sleep(2000);
    	 System.out.println("What is your gpa score");
    	 double score=input.nextDouble();
    	 if(score>=3.5) {
    		 System.out.println("You are eligible for schlorship");
    	 }else {
    		 System.out.println("You should have studied harder");
    	 }
     }else {
    	 System.out.println("Get a degree");
     }
     input.close();
	}

}
