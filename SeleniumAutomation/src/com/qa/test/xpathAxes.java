package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathAxes {

	public static void main(String[] args) {
		System.setProperty("webDriver.edge.Driver", "C:\\Users\\anach\\downloads\\msedgedriver");
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		
		String cityName=driver.findElement(By.xpath
		("//table[@class= 'zebra fw tb-theme']/child:tbody::tr[1]/td[1]")).getText();
		
		System.out.println("Name of the first city" +cityName);
		
		driver.close();

	}

}
