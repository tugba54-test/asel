package com.syntax.class25;

public interface WebDriver {
 void OpenBrowser();
 void MaximizeWindow();
 void CloseBrowser();
 void FindElement();
 
}
class  ChromeDriver implements WebDriver{

	@Override
	public void OpenBrowser() {
   System.out.println(" open browser With Chrome");		
	}

	@Override
	public void MaximizeWindow() {
       System.out.println("Maximize Window with Chrome");		
	}

	@Override
	public void CloseBrowser() {
        System.out.println("Close Browser with Chrome");		
	}

	@Override
	public void FindElement() {
		System.out.println("Find Element with chrome");
	}}
class FirefoxDriver implements WebDriver{

	@Override
	public void OpenBrowser() {
		System.out.println(" open browser With Firefox");
	}

	@Override
	public void MaximizeWindow() {
	       System.out.println("Maximize Window with Firefox");		

	}

	@Override
	public void CloseBrowser() {
        System.out.println("Close Browser with Firefox");		

	}

	@Override
	public void FindElement() {
		System.out.println("Find Element with Firefox");

	}}