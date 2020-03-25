package com.syntax.selfstudy;

public class Car1 {
	public String color;
	public String model;
	public Double engine;
	public int doors;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getEngine() {
		return engine;
	}
	public void setEngine(Double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void start() {
		System.out.println("Araba calisti..");
	}
	public void stop() {
		System.out.println("Araba durdu");
	}

}
