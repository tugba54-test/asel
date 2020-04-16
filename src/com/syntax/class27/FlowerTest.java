package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		//flowers into array
	Flower[] flowerArray={new Rose("Rose"),new Tulip("tulip"),new Sunflower("Sunflower")};
	
	//store flowers into ArrayList
	ArrayList<Flower>flowers=new ArrayList<>();
	flowers.add(new Rose("Rose"));
	flowers.add(new Tulip("Tulip"));
	flowers.add(new Sunflower("Sunflower"));
    //flowers.add("Rose");can not add String Object into ArrayList of Flower Object
	
	//to call available methods using 
	for(int i=0;i<flowers.size();i++) {
	flowers.get(i).bloom();
	System.out.println("-------------");
	}
	for(Flower f:flowers) {
		f.bloom();
		System.out.println("-----------------");
	}
	Iterator<Flower>f=flowers.iterator();
	while(f.hasNext()) {
		Flower x=f.next();
		x.bloom();
		System.out.println("----------");
	}
	
	}

}
