package day7_11thDec2024_multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("deviceList in the page: "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
			WebElement element=deviceList.get(i);
			System.out.println(element.getText());
			
		}

}
}
