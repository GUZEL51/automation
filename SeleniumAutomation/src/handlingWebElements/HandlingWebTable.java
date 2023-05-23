package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebTable {

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
		WebElement customerTable=
				driver.findElement(By.xpath("//a[table[@id='customer']/child::tbody"));
		//capturing all the rows of the table
		List<WebElement>rows = customerTable.findElements(By.tagName("tr"));
		for (WebElement row:rows) {
			List<WebElement>cells = row.findElements(By.tagName("th"));
		 for (WebElement saki:cells) {
			 System.out.print(saki.getText()+ "/t");
		 }
		 System.out.println();
		}
		driver.close();
	}

}
