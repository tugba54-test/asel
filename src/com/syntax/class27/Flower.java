package com.syntax.class27;

public abstract class Flower {
	public String type;
	Flower(String type){
		this.type=type;
	}
	 public abstract  void bloom();

}
class Tulip extends Flower{

	Tulip(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
System.out.println(type+" blooms in March");		
	}
	
}
class Rose extends Flower{

	Rose(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
System.out.println(type+" blooms in june");		
	}
	
}
class Sunflower extends Flower{

	Sunflower(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
System.out.println(type+" blooms in summer");		
	}
	
}