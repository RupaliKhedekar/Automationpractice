package day7_11thDec2024_multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {
/*TC1 
Print all device name along with there price
https://www.demoblaze.com/
 */
	
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		List<WebElement> Listname=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> Listprice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		System.out.println("deviceList in the page:"+Listname.size());
		for(int i=0;i<Listname.size();i++) {
			WebElement element=Listname.get(i);
			WebElement Element=Listprice.get(i);
			System.out.println(element.getText()+"---->"+Element.getText());
			
			
		}
		
		
		

	}

}
