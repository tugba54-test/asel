package com.syntax.class11;

public class Task112 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries,
		/*south america countries,
		europe countries, asian countries, african countries.
		Then print all values from that array using 2 different loops and 
		calculate how many total countries been stored.*/
		String[][] countries= {
				{"North","America","countries","europe"},
				{"Asian","African","Germany"},
				{"canada","meksika","USA"},
				{"morocco","south africa","namibia","uganda"}
		};
		for(int i=0;i <countries.length;i++) {
			for(int y=0;y<countries[i].length;y++) {
				System.out.print(countries[i][y]+" ");
			}System.out.println();

	}
		System.out.println("with advanced loops");
		for(String[] contry:countries) {
			for(String c:contry) {
				System.out.print(c+" ");
			}System.out.println();
		}
	 int sum=0 ;
		for(int i=0;i <countries.length;i++) {
			for(int y=0;y<countries[i].length;y++) {
				sum++;
			}
			
			}
		System.out.println(sum);

	}
}
