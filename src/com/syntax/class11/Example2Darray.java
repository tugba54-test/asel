package com.syntax.class11;

public class Example2Darray {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
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
		      String[][] kitchen= {
						{"spoon","fork","plate","knife"},
						{"defter","kitap","kalem"},
						{"kagit","phone","paper"}
				};int total=0;
		      for(int i=0;i<kitchen.length; i++) {
		    	  for(int y=0;y<kitchen[i].length;y++) {
		    		  total++;
		    		  System.out.print(kitchen[i][y]+" ");
		    	  }System.out.println();
		      }System.out.println("total ="+total);
		      int count=0;
				for(String[] mutfak: kitchen){
					for(String tool:mutfak) {
						System.out.print(tool+" ");
						count++;
					}System.out.println();
					
						
					}System.out.println("count "+count );
				}
	
}
		


				
			
		



	


