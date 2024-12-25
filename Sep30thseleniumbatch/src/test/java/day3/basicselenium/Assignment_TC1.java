package day3.basicselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_TC1 {

	public static void main(String[] args) {
		// TC1:
		// Open browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter application url as
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// enter username as Admin
		WebElement usenameinputfield = driver.findElement(By.name("username"));
		usenameinputfield.sendKeys("Admin");
		// enter password as admin123
		WebElement passwordinputfield = driver.findElement(By.name("password"));
		passwordinputfield.sendKeys("admin123");
		// click login button
		WebElement Loginfield = driver.findElement(By.className("orangehrm-login-button"));
		Loginfield.click();
		// validate login is successful or not
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Login successfull or not? " + currentUrl.endsWith("dashboard/index"));
		// click logout link
		WebElement logoutlink = driver.findElement(By.className("oxd-userdropdown-name"));
		logoutlink.click();
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		// close the browser
		driver.quit();

	}

}
/*
 * TC1: Open browser 
 * enter application url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
 * enter username as Admin 
 * enter password as admin123 
 * click login button 
 * validate login is successful or not 
 * click on profile icon 
 * click logout link 
 * close the browser
 * 
 * 
 */
