package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.mortgagecalculator.org/");
				
				//adding page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//maximizing the window
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//saving the ekement under a variable
				WebElement arm= driver.findElement(By.xpath("//a[text()='ARM']"));
				
				//Create object of Action Class
				Actions act = new Actions(driver);
				//do mouse/hover over action
				act.moveToElement(arm).perform();
				

	}

}
