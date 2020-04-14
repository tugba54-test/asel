package com.syntax.class25;

public class Tasktest {
	public static void main(String[] args) {
		Shape circle=new Circle();
		circle.CalculateArea(6);
		circle.CalculatePerimeter(6);
		Shape square=new Square();
		square.CalculateArea(3);
		square.CalculatePerimeter(6);
		
		
		
		System.out.println("---------------------");
		System.out.println("-------mark class-----");
		Marks a=new A(85,97,54);
		a.getPercentage();
		Marks b=new B(82,98,75,99);
		b.getPercentage();
		
		
		
		RemoteWebDriver [] drivers= {new ChromeDriver4(),new FirefoxDriver2(),
				new Safari() };
				
				for(RemoteWebDriver dr:drivers) {
					System.out.println(dr.getTitle());
					dr.close();
					dr.getScreenshot();
					dr.navigate();
					dr.open();
					
					System.out.println("---------");
				}
		
		
		}
		
		
	
		
	}
	


