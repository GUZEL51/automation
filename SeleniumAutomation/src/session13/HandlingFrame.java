package session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws Exception {
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switching the focus of the driver to the desired frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name = 'classFrame']")));
		//printing the text of the desired element
		System.out.println(driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText());
		//clicking on the link 
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(1000);
		//capturing a text from the landing page
		System.out.println(driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText());
		
		driver.close();
		System.out.println("Frame practice is over");
		
		
		
	}

}
