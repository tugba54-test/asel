package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String message="welcome admin";
       
       // verfy that message contains usernsme which is admin
       System.out.println(message.contains("Admin")+"10");
       
       boolean flag=message.contains("welcome");
       System.out.println(flag+"13");
       System.out.println(message.contains("welcome")+"14");    
       //we want to see if welcome starts with welcome
       System.out.println("---startsWith function-------");
       boolean starts=message.startsWith("welcome");
       System.out.println(starts+"18");
       
       //we want to verify that welcome message end s with usernme
       String username="Admin";
       System.out.println("--ends with--");
       boolean ends=message.endsWith(username);
       System.out.println(ends+"24");
	}

}
