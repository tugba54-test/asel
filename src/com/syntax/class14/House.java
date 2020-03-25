package com.syntax.class14;

public class House {
	
	String kitchen;
    String dining;
    String bedroom;
    int area;
    
    
    
    void garage(){
    	System.out.println(" garage storing items ");
    } void roof() {
    	System.out.println("dont have roof");
    }void garden(){
    	System.out.println("kids can play at the garden");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House str=new House();
		str.kitchen="plate";
		str.dining="food";
		str.bedroom="matress";
		str.area=2750;
		str.garage();
		str.roof();
		str.garden();
		System.out.println("my house has "+str.kitchen+" "+str.dining+"  "+str.bedroom+" "+str.area);
		
          
	}

}
