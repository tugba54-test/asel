package com.syntax.class25;
; interface WebDriver1 {
	static final int b=8;
	void open();
	void close();
	String getTitle();
	

}
interface TakesScreenshot{
	void getScreenshot();
	
}
interface RemoteWebDriver extends WebDriver1,TakesScreenshot{
	void navigate();
}
class ChromeDriver4 implements RemoteWebDriver{

	@Override
	public void open() {
System.out.println("you can  open with "+getTitle());		
	}

	@Override
	public void close() {
System.out.println(" you can close with "+getTitle());		
	}

	@Override
	public void getScreenshot() {
System.out.println("you can get screen shot with "+getTitle());		
	}

	@Override
	public void navigate() {
		System.out.println("you can navigate with  "+getTitle());		
	}

	@Override
	public String getTitle() {
		String getname="Chrome4";
		return getname;
	}
}
class FirefoxDriver2 implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("you can  open with "+getTitle());		
		
	}

	@Override
	public void close() {

		System.out.println("you can  close with "+getTitle());		
		
	}

	@Override
	public void getScreenshot() {
		System.out.println("you can  get Screen shot with "+getTitle());		
		
	}

	@Override
	public void navigate() {
		System.out.println("you can  navigate  with "+getTitle());		
		
	}

	@Override
	public String getTitle() {
     String getName="FireFox";
		return getName;
	}
	
}
class Safari implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("you can  open  with "+getTitle());		

	}

	@Override
	public void close() {
		System.out.println("you can  close  with "+getTitle());		
		
	}

	@Override
	public void getScreenshot() {
		System.out.println("you can  get Screen shot  with "+getTitle());		
		
	}

	@Override
	public void navigate() {
		System.out.println("you can  navigate  with "+getTitle());		
		
	}

	@Override
	public String getTitle() {
String getName="Safari";
		return getName;
	}
	
}
class Task4{
	public static void main(String[] args) {
		
	}
}