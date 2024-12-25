package day1browserinstances;


import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//Create an instance of FirefoxDriver class to launch firefox browser
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}
/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
