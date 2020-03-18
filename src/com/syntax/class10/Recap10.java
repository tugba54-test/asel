package com.syntax.class10;

public class Recap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades=new int[4];
		grades [0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is average
		int average=(grades[0]+grades[1]+grades[2]
				+grades[3])/4;
		System.out.println("average grade is "+average);
		
		
		
		System.out.println("creating an array of cities------");
		// i live in paris*/
        String[] cities= {"Washington DC","New York","Paris","Miami",
        		"Los angeles",
				"Dallas","Chantilly"};
		System.out.println("i live in "+cities[5]);
		
         int x=1;
         System.out.println(cities[x]);
         x+=3;
         System.out.println("i moved to "+cities[x]);
         
         //how many elements stored inside
         int arraySize=cities.length;
         System.out.println("Total elements "+arraySize);
         
         //how can we access last element from an array?
         System.out.println(cities[arraySize-1]);
         
         
         //access all elements from an array
         for(int i=0;i<arraySize;i++) {
        	 System.out.print(cities[i]+"   ");
        
         }
	}

}
