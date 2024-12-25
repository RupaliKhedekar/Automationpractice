package day1browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericBrowserLaunch2 {

	public static void main(String[] args) {
		//Create an instance of FirefoxDriver class to launch firefox browser
		WebDriver driver=new FirefoxDriver();
		//enter application url
		driver.get("https://demo.automationtesting.in/Register.html");
		//validate - title
		String expectedTitle="Register";
		String actualTitle=driver.getTitle();
		System.out.println("is registration page opened? "+actualTitle.equals(expectedTitle));
		//validate url
		String expectedUrl="https://demo.automationtesting.in/Register.html";
		String actualUrl=driver.getCurrentUrl();
		System.out.println("is registration URL entered correctly? "+actualUrl.equals(expectedUrl));
		//close browser
		driver.quit();
	}
}
/*
open firefox browser
enter application url
validate
	application title
	application url
close the browser
*/
