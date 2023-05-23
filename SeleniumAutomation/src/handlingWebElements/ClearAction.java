package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearAction {
	
	public static void main(String[] args) throws Exception{
		

				//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.google.com/");
				
			//added page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			//maximizing the window
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			/*	
			 * use it later
				//use sendkeys method on a web element 
				WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
				userName.sendKeys("Admin");
				
				
				//CLICKING ON Login button 
				//driver.findElement(By.xpath("//button[@type='submit']"));
				
				Thread.sleep(5000);
				
				//clearing 
				userName.clear();
					*/
				//capturing a web element and saving it under a variable
				WebElement searchBox = driver.findElement(By.name("q"));
				//use sendkeys method on a web element 
				searchBox.sendKeys("search for meat");
				//wait only for demo purpose
				Thread.sleep(2000);
				//clearing the search field
				searchBox.clear();
				//capturing gmail link and saving it under a variable
				WebElement gmailLink=(WebElement) driver.findElements(By.xpath("//a[@aria-label='Gmail(opens a new tab)']"));
				//CAPTURING THE TEXT A WEB ELEMENT
				String text =gmailLink.getText();
				System.out.println("The text is:" + text);
				
				//get an attribute of Gmail link 
				String completeLink = gmailLink.getAttribute("herf");
				//print the link
				System.out.println("The entire link is "+ completeLink);
				
				
				
				
				
				

	}

}
