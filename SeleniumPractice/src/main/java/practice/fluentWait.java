package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentWait {
	public static void main(String[] args) {
	/*
	 * Fluent Wait - For a specific element
	 * factors - maximum time to wait, controlling the duration of polling, ignore exceptions 
	 * Example : this can be used when loading/downloading a large file
	 * 			 
	 */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		
		
				
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[text()='Admin']"))).click();
	
}

}
