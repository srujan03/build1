package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new WebDriver();  --> Because WebDriver is an interface but not a Class
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		/*
		 * step 1 - Open a browser and enter the URL
		 * step 2 - Enter Username
		 * step 3 - Enter Password
		 * step 4 - Click on Login
		 * 
		 */
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium123");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Pass123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgot")).click();
		
				
		
		
		
		/*
		 * Locators :
		 * Used to identify web-elements on your browser on the website
		 * 
		 * ID - Unique identity to each element (priority 1) 
		 * name - (priority 2) 
		 * Class - 
		 * CSS selectors - (priority 3) 
		 * tagName - 
		 * Xpath - (priority 3) 
		 * Example : //button[@type='submit']
		 * fullXpath - 
		 * Example : /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button
		 * 
		 * 
		 * URLs :
		 * LinkText - For case of static URLs  (priority 1) 
		 * Example : Forgotten password?
		 * 
		 * PartialLinkText - For the case of Dynamic URLs  (priority 2) 
		 * Example : driver.findElement(By.partialLinkText("Forgot")).click();
		 * 
		 */
		
		
		Thread.sleep(8000);
		driver.quit();
		
	}

}
