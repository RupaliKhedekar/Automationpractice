package day1browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_TC2_GenericBrowserLaunch3 {
/*TC2:
	open Firefox browser
	enter application url - https://demowebshop.tricentis.com/
	validate
		 either with application title or application url
	close the browser
 * 
 */
	public static void main(String[] args) {
		//open Firefox browser
		WebDriver driver=new FirefoxDriver();
		//enter application url - enter application url - https://demowebshop.tricentis.com/
		driver.get("https://demowebshop.tricentis.com/");
		/*validate
		 either with application title or application url
		 */
		//Tiltle:
		String expectedTitle="Demo Web Shop";
		String actualTitle=driver.getTitle();
		System.out.println(expectedTitle.equals(actualTitle));
		//Url:
		String expectedUrl="https://demowebshop.tricentis.com/";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(expectedUrl.equals(actualUrl));
		driver.quit();
		
		
		
	}

}
