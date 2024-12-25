package day7_11thDec2024_multipleElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		//Identifying dropdown uniquely 
		WebElement dropdown=driver.findElement(By.id("Skills"));
		//create an instance of Select class
		Select slt=new Select(dropdown);
		//now you can perform any required operation on dropdown using select class object
		System.out.println("does dropdown allowed to select multiple options? "+slt.isMultiple());
		WebElement element=slt.getFirstSelectedOption();
		System.out.println("Default selected value "+element.getText());
		Thread.sleep(1000);
		slt.selectByVisibleText("Adobe Photoshop");
		System.out.println("After selecting value using visibleText "+slt.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		slt.selectByValue("Backup Management");
		System.out.println("After selecting value using value "+slt.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		slt.selectByIndex(4);
		System.out.println("After selecting value using index "+slt.getFirstSelectedOption().getText());
		
		System.out.println("Dropdown list option count: "+slt.getOptions().size());
	}
}
/*
Operations on Skill dropdown
	- check multiselect allowed or not
	- by default selection
	- select required value from dropdown and validation that is selected or not
	- Total options getting displayed in the dropdown
*/