package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
//		Alert with only OK button
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
//		Alert with ON and CANCEL button
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys("123456");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("123456");
		driver.switchTo().alert().accept();
		
		
//		driver.quit();
		
	}

}
