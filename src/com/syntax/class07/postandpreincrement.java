package com.syntax.class07;

public class postandpreincrement {

	public static void main(String[] args) {
		/*++, --
		 * oreincrement ++y, postincrement y++*/
		int z;
		 int y=10;
		 z=y++;
		 
		 
		 System.out.println(z);
		 int w;
		 int x=10;
		 w=++x;
		 System.out.println(w);
		 
		 int num=1;
		 while(num<5) {
			 
			 System.out.println(++num);
			 System.out.println("--------->");
			 System.out.println(num++);
		 }
		

	}

}
