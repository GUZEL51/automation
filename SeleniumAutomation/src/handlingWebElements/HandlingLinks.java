package handlingWebElements;

import java.io.ObjectInputFilter.Status;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingLinks {

	public static void main(String[] args) { 
		
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");

		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implici wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link =(WebElement) driver.findElements(By.xpath("//a[text()='Online Catalog']"));
		//is disabled
		boolean status = link.isDisplayed();
		System.out.println(status);
		//is enabled
		status = link.isEnabled();
		System.out.println(status); 
		//capturing the name of link 
		String linkText =link.getText();
		System.out.println("The label of the link is weak"+ linkText);
		//click able
		link.click();
		String landingUrl=driver.getCurrentUrl();
		String expectedUrl ="https://www.gcreddy.com/project/";
		if (landingUrl.equalsIgnoreCase(expectedUrl)) {
		System.out.println("Link worked!!");
		} else {
		System.out.println("Test Failed!");
	}
	driver.quit();
}
}