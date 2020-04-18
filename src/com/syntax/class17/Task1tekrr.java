package com.syntax.class17;

public class Task1tekrr {
	protected static int sum(int [] array) {
		int x=0;
		for (int toplam:array) {//for(int i=0;i<array.length;i++){
			x=x+toplam;          //x+=array[i];
		}return x;
	}
	public  static String reverse(String text) {
		String word="";
	
		for(int i=(text.length())-1;i>=0;i--) {
	word=word+text.charAt(i);
		}
		return word;
		
	}
	private static String vowel(String text) {
	String newstr=text.replaceAll("[^aeiouAEIOU]", "");
		return newstr;
		
	}
	public static void main(String[] args) {
	int [] array= {32,56,43,76,98,23};
	System.out.println(sum(array));
	 Task1tekrr obj=new Task1tekrr();
	 System.out.println(vowel("calismadan olmuyor"));
	 System.out.println(obj.reverse("naber nasilsiniz"));

	}

}
