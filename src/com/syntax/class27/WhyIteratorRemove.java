package com.syntax.class27;

import java.util.ArrayList;

public class WhyIteratorRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>drink=new ArrayList();
		drink.add("Maden suyu");
		drink.add("Salgam");
		drink.add("Ayran");
		drink.add("uzum suyu");
		drink.add("sut");
		drink.add("su");
		for(int i=0;i<drink.size();i++) {
			if(drink.get(i).contentEquals("Ayran") || drink.get(i).contentEquals("su")) {
				drink.remove(i);
			}
		}

	}

}
