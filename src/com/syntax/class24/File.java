package com.syntax.class24;


public abstract class File {//partical incompleted
	void file() {
		System.out.println("this is a empty file");
	}
	void dosya() {
		System.out.println("you can add evrything ");
	}
	abstract void open();

}
class Wordfile extends File{//concrete class--degiskenligi olmayan betonlasmis

	@Override
	void open() {

System.out.println(" this is a Word File");
		
	}
	
}
class Java extends File{

	@Override
	void open() {

System.out.println(" this is a JAVA File");
		
	}
	
}
class PDF extends File{

	@Override
	void open() {

System.out.println(" this is a pdf File");
		
	}
	
}
