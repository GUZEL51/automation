package session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
	
		//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("http://jqueryui.com/dropable");
				//adding page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//maximizing the window
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//switching the focus of the driver to the desired frame
				driver.switchTo().frame(driver.findElement(By.xpath("/iframe")));
				
				//saving the WebElements under variables

				WebElement draggable = driver.findElement(By.id("draggable"));
				WebElement dropable = driver.findElement(By.id("dropable"));
				
				//create an objcet of actions class
				Actions dog = new Actions(driver);
				
				Actions drag = null;
				//drag.clickAndHold(draggable).moveToElement(dropable);
				drag.clickAndHold(draggable).moveToElement(dropable).build().perform();
				
				Thread.sleep(1000);
				System.out.println("Drag and drop successful");
				
				
				
				
				
				
	}

}
