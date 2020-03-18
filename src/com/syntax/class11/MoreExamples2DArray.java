package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		// lets create 2d array in which we store professions
		String[][] professions= {
				{"QA Tester","Developers","Product Owner","Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}};
				
		
      for(String [] prof:professions) {
    	  for(String f:prof) {
    		  System.out.print(f+" ");
    	  }System.out.println();
    		  
    	  }
		
	}
}

