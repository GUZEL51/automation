package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChrome {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chromeDriver", "C:\\Users\\anach\\downloads\\chromeDriver");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--Remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
	
		driver.get("http://www.google.com/");
		
		// it will work if chorme is downloaded 

	}

}
