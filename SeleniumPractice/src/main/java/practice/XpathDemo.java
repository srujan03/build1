package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Xpath : Its a way to identify the location of any element on the web page
		 * Syntax : //tagName[@attributeName='value']
		 * -> // : this represents the web element
		 * -> tagName : tagName of the container element
		 * -> @ : select attribute
		 * -> attributeName : attribute name of the web element
		 * -> value : value of the attribute
		 * 
		 * Types of Xpath :
		 * 1. Absolute Xpath
		 * 2. Relative Xpath
		 * 
		 * Accessing using text :
		 * 1. the text() method :
		 * used to access elements using their text content
		 * 
		 * 
		 */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
//		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Day2Selenium");
		
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		

//		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_p')]")).sendKeys("pass123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		
//		driver.findElement(By.xpath("//a[text()='12Arpitha']")).click();
		driver.findElement(By.xpath("//a[text()='Aatmaram']//parent::td//parent::tr//child::td")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();	

		
		
//		Thread.sleep(4000);
//		driver.quit();
		}

}
