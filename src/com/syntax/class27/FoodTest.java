package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
       ArrayList<Food>yemek=new ArrayList<>();
       yemek.add(new Makarna("Makarna"));
       yemek.add(new Adanakebp("Adana"));
       yemek.add(new Pilav("Pilav"));
       
       for(Food y:yemek) {
    	   y.boil();
    	   y.cook();
    	   y.grill();
    	   System.out.println("------------");
       }
      for(int i=0;i<yemek.size();i++) {//runtime polymorhism
    	  
   	   yemek.get(i).cook();
   	yemek.get(i).boil();
   	yemek.get(i).grill();
   	System.out.println("----------");
       }
       
       
       Iterator<Food>f=yemek.iterator();
       while(f.hasNext()) {
    	  Food x= f.next();
    	  x.boil();
    	  x.cook();
    	  x.grill();
    	  System.out.println("-------------"); 
       }
	}

}
