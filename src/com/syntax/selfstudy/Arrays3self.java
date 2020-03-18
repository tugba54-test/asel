package com.syntax.selfstudy;

public class Arrays3self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []cars= {"Honda","toyota","hyundai"};
		System.out.println(cars[2]);
		for(String araba:cars) {
			System.out.print(araba+" ");
			System.out.print("------->");
		}
    for(int x=0; x<=2; x++) {
    	System.out.print(cars[x]+" ");
    }
	}

}
