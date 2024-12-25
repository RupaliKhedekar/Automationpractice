package day4_5thDec2024_sync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) {
		// open browser
		WebDriver driver = new EdgeDriver();
		// maximize window
		driver.manage().window().maximize();
		// enter url https://demo.automationtesting.in/Register.html
		driver.get("https://demo.automationtesting.in/Register.html");
		//// validate register page
		String currentTitle = driver.getTitle();
		String expectedTitle = "Register";
		System.out.println("Is register page opende validating using Title:" + expectedTitle.equals(currentTitle));
//click on WebTable
		driver.findElement(By.linkText("WebTable")).click();
//validate webtable page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(
				"Web Table page opened successfully validating using Url endsWith ?" + currentUrl.endsWith("WebTable.html"));
//come back to register page 
		driver.navigate().back();
		// validate register page
		String currenturl = driver.getCurrentUrl();
		System.out.println("Is register page opende validating using Url endsWith:" + currenturl.endsWith("/Register.html"));
//OR YOU CAN VALIDATE BY TO Title also like see below
		String currenttitle = driver.getTitle();
//String expectedTitle = "Register";
		System.out.println("Is register page opende validation using title:" + expectedTitle.equals(currentTitle));
//go to webtable page 
		driver.navigate().forward();
//validate webtable page
		System.out.println(
				"Web Table page opened successfully validating using Url endsWith ?" + currentUrl.endsWith("WebTable.html"));
//OR
		String CurrentTitle = driver.getTitle();
		String Expectedtitle = "Web Table";
		System.out.println("Web table page validation using title:" + CurrentTitle.equals(Expectedtitle));
//close browser
		driver.close();
	}
}
/**
 * open browser 
 * maximize window 
 * enter url https://demo.automationtesting.in/Register.html 
 * validate register page
 * click on WebTable 
 * validate webtable page 
 * come back to register page 
 * validate register page 
 * go to webtable page 
 * validate webtable page 
 * close browser
 */
