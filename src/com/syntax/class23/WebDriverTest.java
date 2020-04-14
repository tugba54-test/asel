package com.syntax.class23;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.open();//runtime polymorhism
		WebDriver driver1=new FireFoxDriver();
		driver1.open();//runtime polymorhism
		
		
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
        for(int i=0;i<computers.length;i++) {
        	computers[i].cost();
        	computers[i].display();
        }
        //downcasting every computer is not apple computer
       // Applecomputer=new Computer("Comp);you have to expilicitly show it
        SmartMachine sm=new HP("HP");
        sm.smart();
        
        System.out.println("----Animal sayfasinda staticle override yapilmiyr ");
        System.out.println("we are calling method  achieving");
        Animal animal=new Bird();
        animal.sleep();
        animal.whoAmI();
        Bird.whoAmI();
       
	}

}
