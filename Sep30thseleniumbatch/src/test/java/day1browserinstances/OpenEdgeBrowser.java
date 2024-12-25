package day1browserinstances;


import org.openqa.selenium.edge.EdgeDriver;


public class OpenEdgeBrowser {

	public static void main(String[] args) {
		//Create an instance of EdgeDriver class to launch Edge browser
		EdgeDriver edriver=new EdgeDriver();
	}
}
/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
