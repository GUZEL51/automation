package actionItems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A7_Q1 {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		//added page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //input  the username filed 
		 driver.findElement(By.name("username")).sendKeys("anach");
		 //input the pasword field
		 driver.findElement(By.name("Password")).sendKeys("userPass");
		 
		//input the password field
		 driver.findElement(By.name("comments")).clear();
		 driver.findElement(By.name("comments")).sendKeys("It is just a comment!!");
		 
		 //HANDLIBG CHECKBOX3
		 WebElement checkBox = driver.findElement(By.xpath("//input[@value='cb3']"));
		if (checkBox.isDisplayed()  && checkBox.isEnabled() && ! checkBox.isSelected()) {
		checkBox.click();	
		}
		//HANDLIBG adioButton
		 WebElement radioButton = driver.findElement(By.xpath("//input[@value='rd3']"));
		if (checkBox.isDisplayed()  && radioButton.isEnabled() && ! radioButton.isSelected()) {
		radioButton.click();	
		}
		//handling selection item 3
		driver.findElement(By.xpath("//option[@value='ms3']")).click();
		//handling dropdown
		Select dropDn = new Select(driver.findElement(By.xpath("//select [@name='dropdown']")));
		dropDn.selectByValue("dd6");
		//click on submit button
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		//capturing all the inputs and printing all of them
		System.out.println("value for username field>> " + driver.findElement(By.id("_valueusername")).getText()); 
		System.out.println("value for password field>> " + driver.findElement(By.id("_valuepassword")).getText()); 
		System.out.println("value for comments field>> " + driver.findElement(By.id("_valuecomments")).getText()); 
		System.out.println("value for checkBox field>> " + driver.findElement(By.id("_valuecheckBox0")).getText()); 
		System.out.println("value for radio button  field>> " + driver.findElement(By.id("_valueradioval")).getText()); 
		System.out.println("value for multi select field>> " + driver.findElement(By.id("_valuemultiselect0")).getText()); 
		System.out.println("value for dropdown field>> " + driver.findElement(By.id("_valuedropdown")).getText()); 
		System.out.println("value for submit button field>> " + driver.findElement(By.id("_valuesubmitbutton")).getText()); 

		System.out.println("All value are captured!!");
		driver.close();
		
		
		
		
}}
