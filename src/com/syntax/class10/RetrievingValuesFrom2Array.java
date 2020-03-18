package com.syntax.class10;

public class RetrievingValuesFrom2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  month[][]= {
				{"January","February","December","Hi"},
				{"march","April","May"},
				{"June","July","August"},
				{"September","october","November"}
		};
          int rows=month.length;//how many arrays
          int firstArray=month[1].length;//how many element var 1. array de
        		  System.out.println(firstArray);
        		  for(int i=0;i<month.length;i++) {
        			  for(int j=0;j<month[i].length; j++) {
        				  System.out.print(month[i][j]+" ");
        			  }System.out.println();
        					  
        					  
        					  
        					  
        					  
        					 
        		  }
		}

	}


