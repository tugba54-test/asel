package com.syntax.class27;

import java.util.ArrayList;

public class javagoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>drinks=new ArrayList<>();
		String[] arr= {"coca-cola","sprite","tea","coffee","milk","rom"};
		for (int i=0; i<arr.length; i++) {
			drinks.add(arr[i]);
		}
		System.out.println(drinks);
	}

}
