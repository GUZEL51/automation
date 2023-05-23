package actionItems;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A7_Q2 {

	public static <webElement> void main(String[] args) {
		

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/web-table-element.php");
		//added page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		 
	/*	 List columns = (List) table.findElement(By.tagName("th"));
		 System.out.println("Total columns >> "+ ((Object) columns).size());
		 
		 //find out the rows
		 List rows= (List) table.findElement(By.xpath(".//th|.//tr"));
		 
		 System.out.println("Total rows are:" + ((Object) rows).size());
		 System.out.println(
		driver.findElement(By.xpath("//table[@class='dataTable']/tbody/child::tr[6)).getText()
		
		
		
		driver.close();
		*/
		
		
		
		
	}

}
