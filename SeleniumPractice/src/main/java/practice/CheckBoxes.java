package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	
	WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
	checkbox.click();
	
	WebElement option2 = driver.findElement(By.xpath("//label[text()='Option 2']//child::input"));
    option2.click();
    Thread.sleep(2000);
    System.out.println("one ======"+option2.isSelected());
    option2.click();
    System.out.println("two ======"+option2.isSelected());
    System.out.println(option2.isDisplayed());
    System.out.println(option2.isEnabled());
    Thread.sleep(2000);
	 
}

}
