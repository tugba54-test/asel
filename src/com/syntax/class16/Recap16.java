package com.syntax.class16;

public class Recap16 {
	

	
		// create a method that will accept array of integers and return max element
		int getLargestNumber(int[] array);
		int largest=array[0];
		
		for (int i=1;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i]
			}
		}
 return largest;
	}
	//cretae a method that will accept a String and return each word from a given string
	String[] getwordsFrom(String str) {
		String []array=str.split(" ");
		
		return array;
	}
	public static void main(String[] args) {
		Recap16 obj=new Recap16();
		int[] arr= {10,20,38,12};
		System.out.println(obj.getLargestNumber(arr));
		
		String mystr="it is a beautiful world";
		String[] words=obj.getwordsFrom(mystr);
		for(String word:words) {
			System.out.println(word+"   ");

}
}