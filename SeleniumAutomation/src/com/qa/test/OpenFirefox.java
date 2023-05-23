package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.firefoxDriver", "C:\\Users\\anach\\downloads\\firefoxDriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com/");
	}

}
