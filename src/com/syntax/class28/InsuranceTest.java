package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
      ArrayList<Insurance>ins=new ArrayList();
      ins.add(new Car("Geico"));
      ins.add(new Pet("PetsBest"));
      ins.add(new Health("aetna"));
      System.out.println("Regular for loop");
      for(int i=0;i<ins.size();i++) {
    	  ins.get(i).cancelInsurance();
    	  ins.get(i).getQuote();
      }
      System.out.println("Advanced loop");
      for(Insurance i:ins) {
    	  i.cancelInsurance();
    	  i.getQuote();
      }
      Iterator<Insurance>in=ins.iterator();
      System.out.println("-------ITERATOR-----");
      while(in.hasNext()) {
    	  Insurance i=in.next();
    	  i.cancelInsurance();
    	  i.getQuote();
    	  
      }
      
	}

}
