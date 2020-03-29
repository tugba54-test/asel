package com.syntax.class18;

public class USA {
	//create variables to hold state and capital of the state
     String state,stateCapital;
     
     
     //create method to display state and capital
     public  void display() {
    	 System.out.println(state+" and its capital is "+stateCapital);
     }
     
     
     public USA(String State,String stateCapital) {
    	 this.state=state;//you can use current 
    	 this.stateCapital=stateCapital;
    	 
     }

      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  USA obj=new USA("virginia","Richmond");
    	  obj.display();

	}

}
