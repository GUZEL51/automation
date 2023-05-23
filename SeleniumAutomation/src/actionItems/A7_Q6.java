package actionItems;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A7_Q6 {

	public static void main(String[] args) {
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//added page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://selenium.dev/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='content']")));
		//click on differnt link 
		driver.findElement(By.xpath("//a[contains(text(),'White')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Original')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'green')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Original')]")).click();
		//switch back to the parent frame
		driver.switchTo().parentFrame();
		driver.switchTo().frame("menu");
		String title=
		driver.findElement(By.xpath("//h3[text()='Menu 1']")).getText();
		System.out.println("The text of the field is >> " + title) ;
	}
	
	
	public static void captureScreenshot(WebDriver driver, String time) {
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("\"C:\\\\Users\\\\anach\\\\Downloads\\\\Sample\\\\image_\"+time+\".png\""));
		System.out.println("Screenshot captured");
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Screenshot could not be captured!");
	}
		
	}
	public static String currentTime() {
		Date date =new Date();
		return new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(date);
	}
}	
		