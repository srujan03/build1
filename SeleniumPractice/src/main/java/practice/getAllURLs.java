package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllURLs {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		btnLogin.click();
		
		List<WebElement> URLs = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<=URLs.size()-1;i++) {
			
//			System.out.println(URLs);
			System.out.println(URLs.get(i).getText());
			
		}
		
//		System.out.println(URLs);
		WebElement oneTag = driver.findElement(By.tagName("a"));
		System.out.println(oneTag);
		
	}

}
