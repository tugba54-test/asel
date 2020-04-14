package com.syntax.class24;

public class Animal {
	 String food;

	  Animal(String food){
	    this.food=food;
	  }
	   void eats(){
	  System.out.println("Cat eats");    }
	    void sleep(){
	   System.out.println("Cat sleep");
	}}
class Cat extends Animal{
	 
Cat(String food){
    super( food);
  }
   void eats(){
  System.out.println("Cat eats");    }
    void sleep(){
   System.out.println("Animal sleep");
}
}

class kitten1 extends Cat{
  kitten1(String food){
   super(food);
    
  }
    void eats(){
      System.out.println("kitten1 eats "+food);
    }
}
class kitten2 extends Cat{
  kitten2(String food){
   super(food);
    
  }
    void eats(){
      System.out.println("kitten2 eats "+food);
    }
}
class kitten3 extends Cat{
  kitten3(String food){
   super(food);
    
  }
    void eats(){
    
      System.out.println("kitten3 eats "+food);
    }
}


