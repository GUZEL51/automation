package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HankdlingErrorM {

	public static void main(String[] args) {
		//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
			//added page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			//maximizing the window
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//adding user name
				WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
				//CLICKING ON Login button 
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				WebElement error =driver.findElement(By.xpath("//span[text()='Required']"));
				
				//capturing actual error message 
				String actualError=error.getText();
				//expected error message
				String expectedError= "Required";
				//comparing actual vs expected
				if (actualError.equalsIgnoreCase(expectedError)) {
					System.out.println("sorry,Test Failed!");
				}
				//closing the browser
				driver.close();
	}

}
