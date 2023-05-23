package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverActions {

	public static void main(String[] args) throws Exception{
		
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/search?q=facebook&cvid=a8c30f7bf2f444d98c214abb026f0f1d&aqs=edge.1.69i57j46j0l6j46.6781j0j4&FORM=ANAB01&PC=U531");
		
	//added page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//use sendkeys method on a web element 
		WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("Admin");
		
		
		//CLICKING ON Login button 
		//driver.findElement(By.xpath("//button[@type='submit']"));
		
		Thread.sleep(5000);
		
		//clearing 
		userName.clear();
			

		
		
		
		
		
		
		
		
		
		
		
	}

}
