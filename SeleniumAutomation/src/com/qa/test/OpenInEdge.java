package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenInEdge {

	public static void main(String[] args) {
	

		System.setProperty("webDriver.edge.Driver", "C:\\Users\\anach\\downloads\\msedgedriver");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.google.com/");

	}

}
