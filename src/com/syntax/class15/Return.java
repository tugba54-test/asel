package com.syntax.class15;

public class Return {
	
	String donusum(String a,char b) {
		String yeni=a.replace(b, '$');
		return yeni;
	}
	 String a(String b){
		    String yeni=b.toUpperCase();
			return yeni;
		  }
	public static void main(String []args) {
		Return str=new Return();
		System.out.println(str.donusum("trick or treat",'t'));
		System.out.println(str.a("test"));
	}

}
