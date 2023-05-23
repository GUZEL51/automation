package session13;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.transform.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.google.common.io.Files;

public class ScreenShotTest {




	public static void main(String[] args) throws Exception {
	
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://theautomationzone.blogspot.com/2022/01/calculator.html");
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//clicking on 3 
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf
				(By.xpath("//input[@value='2']"))).click();
		//clicking on * sign
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf
				(By.xpath("//input[@value='=']"))).click();
		//clicking on 8 sign
		driver.findElement(RelativeLocator.with(By.tagName("input")).below
				(By.xpath("//input[@value='5']"))).click();
		//clicking on = sign 
		driver.findElement(RelativeLocator.with(By.tagName("input")).below
				(By.xpath("//input[@value='9']"))).click();
		// identifying result field
		driver.findElement(RelativeLocator.with(By.tagName("input")).above
				(By.xpath("//input[@value='1']"))).click();
			WebElement value = null;
		//capturing the result
		WebElement result = value;
		String finalResult= result.getAttribute("value");
		System.out.println("The result is:"+ finalResult);
		captureScreenShot(driver);
		driver.close();
	}
		
	
	public static void captureScreenShot(WebDriver driver) throws Exception  {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//saving file
		Files.copy(src, new File("C:\\Users\\anach\\Downloads\\Sample\\image.png"));
		System.out.println("Screenshot captured!");
	}
} 
