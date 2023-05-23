package actionItems;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A7_Q3 {


	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
				
		driver.get("http://selenium.dev/");
		//added page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		JavascriptExecutor	js = (JavascriptExecutor) driver;
		
		WebElement section = driver.findElement(By.xpath("//div[contains(@class,'row justify-content-aro']"));
		js.executeScript("arufuments[0].scroll", section);
		
		List<WebElement> links = (List<WebElement>) section.findElement(By.tagName("a"));
		System.out.println(((WebElement) links).getText());
		int count= 0;
		for (WebElement link: links) {
		//capturing texts associated with all the links
		System.out.println(link.getText());
		//capturing all the herf attributes of all these links
		//saving the herf values under linkurl variable
		String linkUrl = link.getAttribute("herf");
		if (linkUrl != null) {
			//verify the link of it returns less than 400 value or not 
		}else {
			count++;
			
		}
		}
		System.out.println("Total null links are:"+ count);
		driver.close();
		System.out.println("Link validation is complete!");
	
	/*System.out.println("Total valid links: "+(links.size));
	}
		
	public static void verifyUrlLink(String linkUrl) throws Exception {
		HttpURLConnection httpURLConnection =null;
	//CREATING an object of the URL
	URL url =new URL(linkUrl);
	//typecasting url into httpURLConnection interface
	HttpURLConnection httpURLConnection =(HttpURLConnection)url.openConnection();
	//setting connection timeout
	httpURLConnection.setConnectTimeout(1000);
	//connect with the url
	httpURLConnection.connect();
	if (httpURLConnection.getResponseCode()>=400);
	System.out.println(linkUrl +"is a broken link.");
	} else {
		System.out.println(linkUrl +"is a valid link.");
	}
	}catch(MalformedURLException e) {
		System.out.println(linkUrl +"is not a valid link.");
	}catch (IOException e) {
	}finally {
		//disconnect the url connection
		httpURLConnection.disconnect();*/
	}

	
}
