package com.syntax.class28;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>llist=new LinkedList<>();
        llist.add("ahmet");
        llist.add("Yunus");//comes from collections
        llist.add(0,"Reyhan");//comes from list
        llist.add("Pavel");
        System.out.println(llist.size()+" "+llist.getFirst());
        
        for(String str:llist) {
        	System.out.print(str+"  ");
        }System.out.println();
        for(int i=0;i<llist.size();i++) {
        	System.out.print(llist.get(i)+"  ");
        }System.out.println();
        
        ListIterator<String>list=llist.listIterator();
        while(list.hasNext()) {
        	System.out.print(list.next()+" ");
        }
	}

}
