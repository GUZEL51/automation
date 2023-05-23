package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingALerts {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("http://www.google.com/");

				//adding page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//maximizing the window
				driver.manage().window().maximize();
				//adding implici wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//CLICKING ON Login button 
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(1000);
				// changing the focus of the driver to the alert and saving under a varibale
				Alert popup = driver.switchTo().alert();
				//capturing the text presnet in the alert and printing 
				String alertMessage = popup.getText();
				String expectedMessage ="Please enter a valid user name";
				if (alertMessage.equalsIgnoreCase(expectedMessage)) {
					System.out.println("Alert message is validated");
				}else {
					 System.out.println("Alert did not match!!");
					 }
				//System.out.println(alertMessage);
				Thread.sleep(1000);
				//HANDLING OR ACCEPTING THE ALERT 
				popup.accept();
				Thread.sleep(1000);
				
				driver.close();
				
				
				
	}

}
