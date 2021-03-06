package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println(openWindows);
		Iterator<String> window = openWindows.iterator();
		
		String parentWindow = window.next();
		String childWindow = window.next();
		System.out.println(openWindows +" , "+ openWindows.size());
		
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Strategic Decision Making']")).click();
				
//		System.out.println(driver.getTitle());
//		Thread.sleep(15000);
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		System.out.println(driver.getTitle());		
	}

}
