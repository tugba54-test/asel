package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HouseTest {

	public static void main(String[] args) {
      ArrayList<House>house=new ArrayList<>();
      house.add(new DubleX());
      house.add(new Triblex());
      
      for(int i=0;i<house.size();i++) {
    	  house.get(i).bedroom();
    	  house.get(i).garden();
    	  house.get(i).kitchen();
    	  System.out.println("---regular loop---------");
      }
      for(House h:house) {
    	  h.bedroom();
    	  h.garden();
    	  h.kitchen();
    	  System.out.println("--enhanced loops-------");
      }
      Iterator<House>h=house.iterator();
      while(h.hasNext()) {
    	  House h1=h.next();
    	  h1.bedroom();
    	  h1.garden();
    	  h1.kitchen();
    	  System.out.println("-- iterator-------");
      }
	}

}
