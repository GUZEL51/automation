package session13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.google.common.io.Files;

public class ScreenShotTest2 {

	public static void main(String[] args) throws Exception {
	
	
				//WebDriver.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("https://testpages.herokuapp.com/styled/index.html");
				//adding page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//maximizing the window
				driver.manage().window().maximize();
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				
				driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
				captureScreenShot(driver,null);
				driver.close();
	}
			public static void captureScreenShot(WebDriver driver, String time)throws Exception {
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//saving file
				Files.copy(src, new File("C:\\Users\\anach\\Downloads\\Sample\\image_"+time+".png"));
				System.out.println("Screenshot captured!");
			}
			public static String currentTime() {
				Date date = new Date();
				return new SimpleDateFormat("yyyy_MM_dd_mm_ss").format(date);	
				
			}}

