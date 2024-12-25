package day1browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_TC1_GenericBrowserLaunch3 {
/*
TC1:
	open chrome browser
	enter application url - https://www.saucedemo.com/
	validate
		 either with application title or application url
	close the browser
 * 
 */
	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		//enter application url - https://www.saucedemo.com
		driver.get("https://www.saucedemo.com/");
		/*validate
		 either with application title or application url
		 */
		//Tiltle:
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println(expectedTitle.equals(actualTitle));
		//Url:
		String expectedUrl="https://www.saucedemo.com/";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(expectedUrl.equals(actualUrl));
		driver.quit();
		
		
		
	}

}
