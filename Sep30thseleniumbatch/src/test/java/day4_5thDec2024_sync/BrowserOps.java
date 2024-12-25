package day4_5thDec2024_sync;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserOps {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();
		
		//to open browser with required window size
		driver.manage().window().setSize(new Dimension(500,700));
		
		//to open browser on full screen use
		driver.manage().window().maximize();
		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//after implicit wait, driver will have 0-30 sec to wait before throwing NoSuchElementException
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		
		//you want to come back to login page
		driver.navigate().back();
		//you to go to forgot password screen
		driver.navigate().forward();
		//reload browser window
		driver.navigate().refresh();
		//to navigate to different url
		driver.navigate().to("https://www.google.com");	
	}
}
/*
TC1:
Open browser
enter application url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
enter username as Admin
enter password as admin123
click login button
validate login is successful or not
click on profile icon
click logout link
close the browser
*/
