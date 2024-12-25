package day5_6thDec2024_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {

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
		Point errorMsg_Cords=errorMsg.getLocation();
		int errorMsg_x=errorMsg_Cords.getX();
		int errorMsg_y=errorMsg_Cords.getY();
		System.out.println("Error msg x-cord: "+errorMsg_x);
		System.out.println("Error msg y-cord: "+errorMsg_y);
		
		WebElement username=driver.findElement(By.id("username"));
		Point username_Cords=username.getLocation();
		int username_Cords_x=username_Cords.getX();
		int username_Cords_y=username_Cords.getY();
		System.out.println("username x-cord: "+username_Cords_x);
		System.out.println("username y-cord: "+username_Cords_y);
		
		System.out.println("is error msg displated above username input field? "+(errorMsg_y<username_Cords_y));
		
	}
}
/*
validate error msg position
*/
