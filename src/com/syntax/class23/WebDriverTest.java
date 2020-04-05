package com.syntax.class23;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.open();//runtime polymorhism
		
		System.out.println("----Car class-----");
		Car bmw=new BMW("BMW");
        Car tesla =new Tesla("Tesla");
        Car mer=new Mercedes("Mercedes");
        Car hnda=new Honda("Honda");
        Car[] cars= {new BMW("BMW"), new Tesla("Tesla"),
        		new Mercedes("Mercedes"),new Honda("Honda")};
        for(Car c :cars) {
        	c.start();
        	c.display();
        	System.out.println("--------------");
        }
        for(int i=0;i<cars.length;i++) {
        	cars[i].start();
        	cars[i].display();
        }
        
        System.out.println("------Computer class test----------");
        Computer [] computers= {new Apple("Apple"),new Lenova("Lenova"),new HP("HP"),
        		new Dell("Dell")};
        for(Computer c:computers) {
        	c.display();
        	c.cost();
        	
        }
       
	}

}
