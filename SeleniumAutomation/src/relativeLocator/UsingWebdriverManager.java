package relativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingWebdriverManager {
	
	public static void main(String[] args) {
		
		
		
		//WebDriverManager.EdgeDriver().setup(); // FIX THIS LINE 
		WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://theautomationzone.blogspot.com/");
		//maximizing
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'with small delay')]")).click();
						
		//  // p[contains(text(),'with small delay')]	
		
		//CREATING A REFERNCE VARIABLE OF WEBDRIVERWAIT CLASS
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//SETTIG WAIT conditions for the elements and capturing teh text 
		//saving the text under a variable
				
	String message=  wait.until(ExpectedConditions.elementToBeClickable
			( By.xpath("//p[contains(text(),'with small delay')]"))).getText();
						
								//printing thr text.
								System.out.println(message);
	}

	private Object EdgeDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}