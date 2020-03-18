package logicaloperators;

public class Recap{
	public static void main (String[] args) {
		/* if hour between1-11 =morning
		 * 12-15=afternoon
		 * 16-20=evening
		 * 21-24=night
		 */
		int hour=15;
		String timeofday;
		
		if(hour>=1 && hour<=11) {
			timeofday="morning";
		}else if (hour>=12 && hour<=15) {
		    timeofday="afternoon";
		}else if(hour>=16 && hour<=20) {
			timeofday="evening";
		}else if(hour>=21 && hour<=24) {
			timeofday="night";
		}else {
			timeofday="unknown";
		}
		// if time of the day is not unknown---> only then i want to see the message
		if(!timeofday.contentEquals("unknown")) {
		System.out.println("right now is "+timeofday);
		}	
		
		
	}
}
