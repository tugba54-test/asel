package com.syntax.class17;

public class StaticKeyWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword.brand="android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
		
		//access  instance members of another class
		StaticKeyword sk=new StaticKeyword();
		sk.color="red";
		sk.memory=128;
	
		 StatickeyWordtekrr str=new  StatickeyWordtekrr();
		 str.color="pink";
		 str.memory=128;
		 str.displaySpecifications();
		 
		StaticKeyword sk1=new StaticKeyword();
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyword sk2=new StaticKeyword();
		sk2.color="red";
		sk2.memory=128;
		//change the static when you change the static they changed all features 
		//normalde hepsi iphone du hepsi nokia oldu
		sk2.brand="nokia";
		//
		sk.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk2.displayGeneralInfo();
		
		
	}

}
