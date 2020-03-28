package com.syntax.class18;

public class Araba {
	//fields,properties
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public Araba(String color,String model) {
		this(color,model,0,0);
	}
	
	public Araba() {
//		this.color="Bilgi yok";
//		this.model="Bilgi yok";
//		this.engine=0;
//		this.doors=0;
		this("bilgi yok","bilgi yok",0,0);
	}
	
	public Araba(String color,String model,double engine,int doors) {
		this.color=color;
		this.model=model;
		this.engine=engine;
		this.doors=doors;
		
	}

	
	public void setColor(String color) {
		this.color=color;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		if(doors==2 || doors==4) {
		this.doors = doors;
	}
		else {
			System.out.println("Kapi sayisi  sadece 2 veya 4 olabilir");
		}
	}
	public void setModel(String model) {
		
		this.model=model;
	}
	public String getColor() {
		return this.color;
		
	}
	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public void start() {
		System.out.println("araba calisti");
	}
	public void stop() {
		System.out.println("araba durdu");
	}
	public void showInfos() {
		System.out.println("Arabanin rengi "+this.color);
		System.out.println("Arabanin  modeli"+this.model);
		System.out.println("Arabanin engine hacmi  "+this.engine);
	    System.out.println("Arabanin kapi sayisi "+this.doors);
	}

}
