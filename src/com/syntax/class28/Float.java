package com.syntax.class28;

public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //float f=12.3F;
//  String s=String.valueOf(f);
//  System.out.println(s);
  for(int i=0;i<3;i++) {
	  for(int j=3;j>=0;j--) {
		  if(i==j)
			  continue;//skipping the loop
		  System.out.println(i+" "+j);
	  }
  }
	}

}
