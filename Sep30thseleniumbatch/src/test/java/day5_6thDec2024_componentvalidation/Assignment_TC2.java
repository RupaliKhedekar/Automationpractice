package day5_6thDec2024_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_TC2 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("enter url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//get username and password from the screen
		WebElement username=driver.findElement(By.className("oxd-text"));
		String usernametext=username.getText();
		driver.findElement(By.name("username")).sendKeys(usernametext);
		WebElement password=driver.findElement(By.className("oxd-text"));
		String passwordtext=password.getText();
		
		driver.findElement(By.name("password")).sendKeys(passwordtext);
		
		
		
		
		
		
		
		
		
		
		

	}

}
/*TC2:
open browser and enter url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
get username and password from the screen 
and try to login into application
 * 
 * 
 */
