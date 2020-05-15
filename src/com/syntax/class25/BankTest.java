package com.syntax.class25;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drivable car=new Cars();
		car.drive();
		Cars car1=new Cars();
		car1.drive();
		car1.stop();
		System.out.println("------------------");
		System.out.println("---Bank2 class Test--------");
		BOA boa=new BOA();
		boa.depositMoney();
		
		boa.GiveCredit();
		boa.trust();
		boa.WithDraw();
		
		PNC pnc=new PNC();
		pnc.depositMoney();
		
		pnc.trust();
		pnc.WithDraw();
		
		Bank2 bank=new BOA();
		bank.depositMoney();
		bank.trust();
		bank.WithDraw();
		
		
		System.out.println("---------------");
		System.out.println("-----Web DRIVER---------");
		WebDriver chrm=new ChromeDriver();
		chrm.CloseBrowser();
		chrm.MaximizeWindow();
		chrm.FindElement();
		chrm.OpenBrowser();
		WebDriver fr=new FirefoxDriver();
		fr.CloseBrowser();
		fr.MaximizeWindow();
		fr.FindElement();
		fr.OpenBrowser();
		
		
		
				
		

	}

}
