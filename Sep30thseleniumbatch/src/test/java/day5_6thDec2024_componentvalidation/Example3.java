package day5_6thDec2024_componentvalidation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), "Username or Password is invalid. Please try again."));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		
		System.out.println("Error msg font color: "+errorMsg.getCssValue("color"));
		System.out.println("Error msg font size: "+errorMsg.getCssValue("font-size"));
		System.out.println("Error msg font family: "+errorMsg.getCssValue("font-family"));
		
		
	}
}
/*
validate error msg color, font-size, font-family
*/