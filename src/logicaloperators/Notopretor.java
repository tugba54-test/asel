package logicaloperators;

public class Notopretor {

	public static void main(String[] args) {
		//  not(!) -reverse the condition
		boolean b= !true;
		boolean val=!false;
		System.out.println(b);
		System.out.println(val);
		 
		boolean iscold=true;
		
		if(!iscold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
       String day1="monday";
       
       // if it is not monday or friday
       if(!(day1.contentEquals("monday") && day1.contentEquals("friday"))) {
    	   System.out.println("find me at syntax");
       }
       //day is not monday and friday
       if(!day1.contentEquals("monday") || !day1.contentEquals("friday") ) {
    	   System.out.println("find me at syntax");
       }
	}

}
