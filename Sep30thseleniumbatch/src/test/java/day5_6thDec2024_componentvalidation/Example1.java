package day5_6thDec2024_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		System.out.println("is username input field visible on the screen? "+username.isDisplayed());
		System.out.println("is username input field editable on the screen? "+username.isEnabled());
		System.out.println("Default value of username input field: "+username.getAttribute("placeholder"));
	
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("is keepLoggedInCheckBox visible on the screen? "+keepLoggedInCheckBox.isDisplayed());
		System.out.println("is keepLoggedInCheckBox clickable? "+keepLoggedInCheckBox.isEnabled());
		System.out.println("is keepLoggedInCheckBox by default selected? "+keepLoggedInCheckBox.isSelected());
		keepLoggedInCheckBox.click();
		System.out.println("After selecting keepLoggedInCheckBox status is "+keepLoggedInCheckBox.isSelected());
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		System.out.println("is loginButton visible on the screen? "+loginButton.isDisplayed());
		System.out.println("is loginButton clickable? "+loginButton.isEnabled());
		System.out.println("default name on button: "+loginButton.getText());
	}
}
/*
Username:
	visible
	editable
	default value
Checkbox:
	visible
	functional/clickable
	default selection
	after selection
Button:
	visible
	functional
	button name
*/
