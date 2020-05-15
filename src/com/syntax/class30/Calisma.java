package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Calisma {

	public static void main(String[] args) {
		//1-dostoyevski,2-kemalettintugcu,3-balzac
Map<Integer,Kitap>book=new LinkedHashMap();
book.put(1, new Dostoyevski("Suc ve Ceza", 12345));
book.put(2, new KemalettinTugcu("Ahretlik",4567));
book.put(3,new Balzac("Vadideki Zambak",7890));

Collection<Kitap>c=book.values();
for(Kitap a:c) {
	a.display();
	a.read();

	System.out.println("---------------");
}System.out.println("iterator");
 Iterator<Kitap>kit=c.iterator();
 while(kit.hasNext()) {
	 Kitap k=kit.next();
	 k.display();
	 k.read();
	 System.out.println("--------------");
 }
 System.out.println("-Entry Set---");
 Set<Entry<Integer,Kitap>>kit1=book.entrySet();
for(Entry<Integer,Kitap>kit2:kit1) {
	System.out.print(kit2.getKey()+" ");
	kit2.getValue().display();
	kit2.getValue().read();
}
System.out.println("---------Iterator------");
Iterator<Entry<Integer,Kitap>>books=kit1.iterator();
while(books.hasNext()) {
	Entry<Integer, Kitap> b=books.next();
	
	System.out.print(b.getKey()+" ");
	b.getValue().display();
	b.getValue().read();
	System.out.println("--------------------");
}












	}

}
abstract class Kitap{
	String name;
	int barcode;
	Kitap(String name,int barcode){
		
		this.name=name;
		this.barcode=barcode;
		System.out.println(name+" "+barcode+" Adile's sister way");

	}
	void display() {
		System.out.println(name+" kitap okumak cok faydalidir");
	}
	abstract void read() ;
}
class Dostoyevski extends Kitap{

	Dostoyevski(String name, int barcode) {
		super(name, barcode);
		// TODO Auto-generated constructor stub
	}

	@Override
	void read() {
System.out.println(name+" kitabi biraz agir");		
	}
	
}
class Balzac extends Kitap{

	Balzac(String name, int barcode) {
		super(name, barcode);
		// TODO Auto-generated constructor stub
	}

	@Override
	void read() {
System.out.println(name+" kitabi turkceye cevirilmistir"); 		
	}
	
}
class KemalettinTugcu extends Kitap{

	KemalettinTugcu(String name, int barcode) {
		super(name, barcode);
		// TODO Auto-generated constructor stub
	}

	@Override
	void read() {
System.out.println(name+" yeni nesil okumali");		
	}
	
}