package com.syntax.class11;

public class Recap11 {

	public static void main(String[] args) {
		// get all values from 2d array
		String[][] groceries= {
				{"cucumber","potato","carrot"},
				{"mango","apple","banana","kiwi"},
				{"milk","cheese","yogurt"}
		};
		for(int i=0; i<groceries.length;i++) {
			for(int y=0; y<groceries[i].length;y++) {
				System.out.print(groceries[i][y]+" ");
			}System.out.println();
		}
		System.out.println("--getting element advanced for loop---");
		for (String [] grcory:groceries) {
			for(String items:grcory) {
			System.out.print(items+" ");
		}System.out.println();

	}
	}
}
