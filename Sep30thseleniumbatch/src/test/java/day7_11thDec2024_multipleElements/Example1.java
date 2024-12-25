package day7_11thDec2024_multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
	List<WebElement> linkList=	driver.findElements(By.tagName("a"));
	System.out.println("Link in the page:"+linkList.size());
	for (int i=0;i<linkList.size();i++) {
		WebElement elemnt=linkList.get(i);
		System.out.println(elemnt.getAttribute("href"));
	}
	

		
		
		
	}

}
