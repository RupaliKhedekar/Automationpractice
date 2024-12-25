package day1browserinstances;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		//Create an instance of ChromeDriver class to launch chrome browser
		ChromeDriver cdriver=new ChromeDriver();
	}
}
/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
