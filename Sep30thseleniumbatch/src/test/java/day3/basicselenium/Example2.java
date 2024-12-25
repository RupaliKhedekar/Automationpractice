package day3.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//identify username input field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//clear username input field
		usernameInputField.clear();
		//type user name as 'admin' into username input field
		usernameInputField.sendKeys("admin");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		
		//identify login button
		WebElement loginButton=driver.findElement(By.className("buttonBlue"));
		loginButton.click();
		
		String currentTitle=driver.getTitle();	
		String expectedTitle="Dashboard";
		System.out.println("Login successfull or not? "+currentTitle.equals(expectedTitle));
	}
}
/*
Step1: identify the required element using findElement(By)

findElement(By)- use to identify the element using "By" class and this class has predefined methods which are also known as locators and return the WebElement.

WebElement element=driver.findElement(By.id(""));
										.name(""));
										.linkText(""));
										.className(""));
										.partialLinkText(""));
										.tagName(""));
										.cssSelector(""));
										.xpath(""));
										
Step2: once you identify the WebElement you can perform required operation it
	a. type text  			----> sendkeys("");
	b. delete existing text ----> clear();
	c. click on element     ----> click();
	
	element.sendkeys("amdin");
	element.clear();
	element.click();

*/