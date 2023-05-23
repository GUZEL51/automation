package session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://target.com/");
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement target1=driver.findElement(By.xpath("//span[text()='save on,saver']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//scroll drwn
		
		js.executeScript("windows, scrollBy(0,2500");
		Thread.sleep(2000);
		
		
		
		
		WebElement deals=driver.findElement(By.xpath("//img[@alt='Target Deals']"));
		//deals.click();
		 driver.close();
				
	}

}
