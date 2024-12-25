package day1browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Assignment_TC3_GenericBrowserLaunch3 {
/*TC3:
	open Edge browser
	enter application url - https://sampleapp.tricentis.com/101/app.php
	validate
		 either with application title or application url
	close the browser
 * 
 */
	public static void main(String[] args) {
		//open Edge browser
		WebDriver driver=new EdgeDriver();
		//enter application url - enter application url - https://demowebshop.tricentis.com/
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		/*validate
		 either with application title or application url
		 */
		//Tiltle:
		
		String expectedTitle="tricentis";
		String actualTitle=driver.getTitle();
		System.out.println(expectedTitle.equals(actualTitle));
		//Url:
		String expectedUrl="https://sampleapp.tricentis.com/101/app.php";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(expectedUrl.equals(actualUrl));
		driver.quit();
		
		
		
	}

}
