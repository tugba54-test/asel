package com.syntax.class19;

public class USA {
	String state,stateCapital;
	private Object displayState;;
	public USA(String state,String stateCapital) {
		this.state=state;
		this.stateCapital=stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	// can i call a method inside another method?---->yes
	public void displayInfo() {
		displayState();//by default compiler add this keyword to a method
		displayStateCapital();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USA state1=new USA("Texas","Austin");
		state1.displayState();
		state1.displayStateCapital();
       state1.displayInfo();
       state1=new USA("Geogia","Atlanta");
       state1.displayInfo();
       
	}

}
