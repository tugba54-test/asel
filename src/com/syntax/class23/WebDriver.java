package com.syntax.class23;

public class WebDriver {
	public void open() {
		System.out.println("Opening browser");
	}

}
class FireFoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening  Firefox browser");
	}
}
class ChromeDriver extends WebDriver{
	public void open() {
		System.out.println("Opening  Chrome browser");
	}
}
class InternetExplorerDriver extends WebDriver{
	public void open() {
		System.out.println("Opening IE browser");
	}
}