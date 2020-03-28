package com.syntax.class18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// car1.color="Gumus";
//		car1.model="Renault";
//	    car1.setEngine(1.6);
//		car1.setDoors(3);
//		car1.setColor("Gumus");
//		car1.setModel("Renault");
//		System.out.println("Arabanin rengi "+car1.getColor());
//	System.out.println("Arabanin  modeli"+car1.getModel());
//	System.out.println("Arabanin engine hacmi  "+car1.getEngine());
//		System.out.println("Arabanin kapi sayisi "+car1.getDoors());
//		car1.start();
//		car1.stop();
		Araba car1 = new Araba("Gumus", "Renault", 1.6, 4);
		Araba car2 = new Araba();
		Araba car3=new Araba("siyah","toyota");
		car1.showInfos();
		car2.showInfos();
		car3.showInfos();

	}

}
