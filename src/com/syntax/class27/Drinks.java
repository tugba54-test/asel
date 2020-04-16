package com.syntax.class27;

import java.util.ArrayList;

public class Drinks {
	public static void main(String[] args) {
		ArrayList<String>drink=new ArrayList();
		drink.add("Maden suyu");
		drink.add("Salgam");
		drink.add("Ayran");
		drink.add("uzum suyu");
		drink.add("sut");
		drink.add("su");
		for(int i=0;i<drink.size();i++) {
			if(drink.get(i).contains("a") || drink.get(i).contains("e")){
					drink.set(i,"water");
					
					
		}
			System.out.print(drink.get(i)+" ");
		}
		

}
}