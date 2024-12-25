package day7_11thDec2024_multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("is suggList equals to 10? "+(suggList.size()==10));
		for(int i=0;i<suggList.size();i++) {
			//re-initializing suggestion list to avoid StaleElementException
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			WebElement element=suggList.get(i);
			System.out.println(element.getText());
			if(element.getText().contains("selenium")) {
				System.out.println("Suggestion contains selenium word...");
			}else {
				System.out.println("Suggestion doesn't contains selenium word...");
			}
		
		
		
	}
	}
}


