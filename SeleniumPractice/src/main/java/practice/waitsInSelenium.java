package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitsInSelenium {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Thread.sleep() 
		 * It is a bad approach as it will make your code wait compulsorily for the specified amount of time even if the 
		 * element is available before 
		 * Not Recommended
		 * 
		 * 
		 * WAITS
		 * there are 2 types of Waits in Selenium
		 * 1. Implicit wait - It is applicable to all elements.
		 * Here it will wait for specified time before throwing an error, but if the rescource is available before that time 
		 * it will execute the action on tht resource
		 * 2. Explicit wait - Applicable for specific elements. 
		 * 		a. WebDriverWait
		 *  
		 * 
		 * 
		 * 
		 */


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Cecil.Bonaparte']//parent::td//preceding-sibling::td//input")).click();
		driver.findElement(By.id("btnDelete")).click();
		//driver.findElement(By.id("dialogDeleteBtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dialogDeleteBtn"))).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
