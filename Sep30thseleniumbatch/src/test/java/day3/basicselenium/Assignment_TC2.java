package day3.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_TC2 {

	public static void main(String[] args) {
		// Open browser
		WebDriver driver = new EdgeDriver();
		// enter application url as https://demowebshop.tricentis.com/
		driver.get("https://demowebshop.tricentis.com/");
		// click on login
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		// enter username as tester01@vomoto.com
		WebElement usernameinputfield = driver.findElement(By.name("Email"));
		usernameinputfield.sendKeys("tester01@vomoto.com");
		// enter password as Abc@12345
		WebElement passwordinputfield = driver.findElement(By.id("Password"));
		passwordinputfield.sendKeys("Abc@12345");
		// click on login button
		WebElement loginbuttton = driver.findElement(By.className("login-button"));
		loginbuttton.click();
		// validate login is done or not
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demowebshop.tricentis.com/";
		System.out.println("login successfull or not?" + currentUrl.equals(expectedUrl));
        //click on logout
		WebElement logout = driver.findElement(By.className("ico-logout"));
		logout.click();
		// close the browser
		driver.close();

	}

}
/*
 * TC2: Open browser 
 * enter application url as https://demowebshop.tricentis.com/
 * click on login 
 * enter username as tester01@vomoto.com
 * enter password as Abc@12345 
 * click on login button 
 * validate login is done or not 
 * click on logout
 * close the browser
 * 
 * 
 */
