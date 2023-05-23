package relativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocator1 {

	public static void main(String[] args) {
		System.setProperty("webDriver.edge.Driver", "C:\\Users\\anach\\downloads\\msedgedriver");
		WebDriver driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//added implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//indentify  a web element which will help us to find out our desired elements
		//WebElement label= driver.findElement(By.xpath("//label[text()='Password']"));
		WebElement xyz= driver.findElement(By.xpath("//label[text()='Password']"));
		
		//using relatrive locator above to find out an input tag (user name field)
		//((WebElement) driver.findElements(RelativeLocator.with(By.tagName("input")).above(label))).sendKeys("Admin");
		((WebElement) driver.findElements(RelativeLocator.with(By.tagName("input")).above(xyz))).sendKeys("Admin123");
		
	
		driver.close();

	}

	}

