package day3.basicselenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Asiignment_TC3 {

	public static void main(String[] args) {
		//Open browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter application url as https://www.opencart.com/index.php?route=account/login
		driver.get("https://www.opencart.com/index.php?route=account/login");
		//validate login page opened or not
		String expectedUrl = "https://www.opencart.com/index.php?route=account/login";
		String actualUrl = driver.getCurrentUrl();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("login page opened or not?"+currentUrl.endsWith("account/login"));
		
		System.out.println("login page opened or not?"+ actualUrl.equals(expectedUrl));
		//close browser
		driver.quit();
		
	}

}
/*
TC3:
Open browser
enter application url as https://www.opencart.com/index.php?route=account/login
validate login page opened or not
close browser

*/