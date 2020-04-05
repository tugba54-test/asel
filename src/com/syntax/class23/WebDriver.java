package com.syntax.class23;

public class WebDriver {
	public void open() {
		System.out.println("Opening browser");
	}

}
class FireFoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening  Firefoxbrowser");
	}
}
class ChromeDriver extends WebDriver{
	public void open() {
		System.out.println("Opening  Chromebrowser");
	}
}
class InternetExplorerDriver extends WebDriver{
	public void open() {
		System.out.println("Opening IE browser");
	}
}