package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasktugba {

	public static void main(String[] args) {
   ArrayList<Integer>num1=new ArrayList<>();
   for(int i=50;i<=100;i++) {
	   if(!((i%2)==0)) {
		   num1.add(i);
	   }
   }
   System.out.println(num1);
   Iterator<Integer>ns=num1.iterator();
   while(ns.hasNext()) {
	   if(ns.next()%3==0) {
		   ns.remove();
	   }
   }
   System.out.println(num1);
}}