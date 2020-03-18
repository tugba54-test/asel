package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {
		/* if hour between 1-11---->morning
		 * between 12-15------------>afternoon
		 * between 16-20------------->evening
		 * between 21-24----------->night
		 */
		int hour=21;
		String timeofday;
		if (hour>=1 && hour<=11) {
			timeofday="morning";
		}else if(hour>=12 && hour<=15) {
			timeofday="afternoon";
		}else if(hour>=16 && hour>=20) {
	        timeofday="evening"; 
		}else if (hour>=21 && hour<=24) {
			timeofday="night";
		}else {
			timeofday="unkown";
		}
		if(!timeofday.contentEquals("unkown")) {
			System.out.println("right now is "+timeofday);
		}
	}

}