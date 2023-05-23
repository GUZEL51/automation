package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditBoxTest {

	public static void main(String[] args) {
	
		//WebdriverManager,EdgeDriver()).setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");

		//adding page liad timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//capturing web element and saving it under a variable
		WebElement searchBox= driver.findElement(By.name("q"));
		
		//displayed validation 
		boolean status = searchBox.isDisplayed();
		System.out.println(status);//true
		
		// enabaled validation
		boolean status2 = searchBox.isDisplayed();
		System.out.println(status2);//true
	}

}
