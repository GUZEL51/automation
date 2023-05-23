package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/index.html");
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//saving the ekement under a variable
		WebElement RadioButton1 = driver.findElement(By.xpath("//input[@value='rd1']"));
		
		//displayed
		 RadioButton1.isDisplayed();
		//enabled 
		 RadioButton1.isEnabled();
		//selected status
		 RadioButton1.isSelected();
		//checking all three conditions to click on the checkBox
		if( RadioButton1.isDisplayed() &&  RadioButton1.isEnabled() &&! RadioButton1.isSelected());
		 RadioButton1.click();
		}
	
	
	//printing the status 
	//System.out.println("Check Box is Selected:" +  RadioButton1.isSelected());
	//driver.close();

	
	
}
