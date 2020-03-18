package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars= {
				{"American","German","Korean","Italian"},
				{"bilmiyorum","Dodge","Kreancars","Italiancar"},
		};
		int total=0;
		for(int i=0;i <cars.length;i++) {
			for(int y=0;y<cars[i].length;y++) {
				System.out.print(cars[i][y]+" ");
				total++;
			}System.out.println();
		}
		System.out.println("with advanced loops");
		int count=0;
		for(String[] car:cars) {
			for(String c:car) {
				System.out.print(c+" ");
				count++;
			}System.out.println();
		}System.out.println("Total= "+count);

	}

}
