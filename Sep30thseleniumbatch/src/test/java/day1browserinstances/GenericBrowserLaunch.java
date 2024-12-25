package day1browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericBrowserLaunch {

	public static void main(String[] args) {
		//Create an instance of ChromeDriver class to launch chrome browser
		WebDriver driver=new ChromeDriver();
		//enter application URL
		driver.get("https://www.google.com");
		//get application title
		String appTitle=driver.getTitle();
		System.out.println("Application title: "+appTitle);
		System.out.println("Application title char count: "+appTitle.length());
		//Application current url
		String appUrl=driver.getCurrentUrl();
		System.out.println("Application URL: "+appUrl);
		System.out.println("Application URL char count: "+appUrl.length());
		//application source code
		String pageSourceCode=driver.getPageSource();
		System.out.println("Page source code char count: "+pageSourceCode.length());
		//close current browser instance
		driver.quit();
	}
}
/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
