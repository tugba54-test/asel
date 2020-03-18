package logicaloperators;

public class Morelogical {

	public static void main(String[] args) {
		/* we have total 7 days in a week
		 * if day is 2,3 ---->sdlc class
		 * if day 6,7----->java class
		 * if day 1,5----->off day
		 *if day 4 ----->review class
		 */
		int day=5;
		day=7;
		// to compare 2 number we use equality operator
		if (day==2 || day==3) {
			System.out.println("today is sdlc class");
		}else if(day==6 || day==7) {
			System.out.println("today is a java class");
		}else if(day==1 || day==5) {
			System.out.println("today is no class");
		}else if(day==4) {
			System.out.println("today is review class");
		}else {
			System.out.println("invalid day");
		}
            System.out.println("-----------using strings---------->");
            // to compare string we use equals
            String day1="thursday";
            
            if (day1.contentEquals("tuesday") || day1.contentEquals("wednesday")) {
            	System.out.println("today is sdlc class");
            }else if (day1.contentEquals("saturday")|| day1.contentEquals("sunday")){
            		System.out.println("today is java class");
	        }else if(day1.equals("monday")  || day1.equals("friday")) {
		          System.out.println("today is no class");
	        }else if(day1.equals("thursday"))  {
		          System.out.println("today is review class");
	        } else {
	        	System.out.println("today is invalid day");
    }
	}
}
            
            
            
            
            
	


