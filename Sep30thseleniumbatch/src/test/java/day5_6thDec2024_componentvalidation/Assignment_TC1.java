package day5_6thDec2024_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_TC1 {

	public static void main(String[] args) {
		//browser 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//url https://demowebshop.tricentis.com/login
		driver.get("https://demowebshop.tricentis.com/login");
		//click on login button
		driver.findElement(By.className("login-button")).click();
		//error msg is getting displayed above email id input field
		WebElement message_error=driver.findElement(By.className("message-error"));
		Point message_errorcord=message_error.getLocation();
		int message_errorcordX=message_errorcord.getX();
		int message_errorcordy=message_errorcord.getY();
		System.out.println("message_errorcordy:"+message_errorcordy);
		//error msg color
		System.out.println("error msg color:"+message_error.getCssValue("color"));
		//error msg font-size
		System.out.println("error msg font-size:"+message_error.getCssValue("font-size"));
		//error msg font-family
		System.out.println("error msg font-family:"+message_error.getCssValue("font-family"));
		WebElement username=driver.findElement(By.id("Email"));
		Point username_Cord=username.getLocation();
	int username_CordX=username_Cord.getX();
	int username_CordY=username_Cord.getY();
	System.out.println("username_CordY:"+username_CordY);
	//error msg is getting displayed above email id input field
	System.out.println("is error msg displayed above username Email id input field? "+(username_CordY>message_errorcordy));
		driver.quit();
		
		
		
		
		

	}

}
/*
open browser and url https://demowebshop.tricentis.com/login
click on login button
validate:
	error msg is getting displayed above email id input field
	error msg color
	error msg font-size
	error msg font-family
	*/
