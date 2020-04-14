package com.syntax.class26;

public class Wrapperclasses {

	public static void main(String[] args) {
       Integer num=10;
      String s= num.toString();
      System.out.println(num.MIN_VALUE);
      
      //auto boxing
      Byte b=90;
      System.out.println(b.MAX_VALUE);
      System.out.println(b.MIN_VALUE);
      String s1=b.toString();
      System.out.println(s1);
      
      Boolean bool=true;
      //auoto unboxing
      boolean b1 =bool;
      
	}

}
