package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	

	public static void main(String[] args) throws Exception {
/*
		System.setProperty("webDriver.firefoxDriver", "C:\\Users\\anach\\downloads\\firefoxDriver");

		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		//get all the imports afetr adding selenium jar
	
*/

		
		System.setProperty("webDriver.EdgeDriver", "C:\\Users\\anach\\downloads\\EdgeDriver");
		
		WebDriver driver =new EdgeDriver();
		//browser navigation commands
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.get("http://www.target.com");
		//method cahnge
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back(); 
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		//refresh the page
		driver.navigate().refresh();
		driver.get("http://www.firefox.com");
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.close();

		//successful
		
	}

}
