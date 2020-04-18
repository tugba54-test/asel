package com.syntax.class17;

public class Task172 {
	public String tugba(String a) {
		
		String reverse="";
		for(int i=(a.length())-1;i>=0;i--) {
			reverse=reverse+a.charAt(i);
		}
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task172 obj=new Task172();
		
		
		System.out.println(obj.tugba("Kubra"));

	}

}
