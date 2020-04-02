package com.syntax.selfstudy;

public class Main {
	static String name;
	  static String year;
	  static String lastday;
		 static  int batch;
		 public Main(){
		     this(null,0,"0",null);
		} 
		public Main(String name,int batch,String year,String lastday){
		  this.name=name;
		  this.batch=batch;
		  this.year=year;
		  this.lastday=lastday;
		}
		void display(){
		  
		  System.out.println(name+" "+batch+" "+year+" "+lastday);
		}
		public static void main(String[] args){

		}}

