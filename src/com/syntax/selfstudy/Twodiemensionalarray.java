package com.syntax.selfstudy;

public class Twodiemensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] fnum= {  {1,2,3},{4,5}, {6,7,8},{9,10,11} };
		
		for(int i=0;i<=2;i++) {
			for(int x=0; x<fnum[i].length; x++) {
				System.out.print(fnum[i][x]+" ");

			}
		}
		
		
		
	}

}
