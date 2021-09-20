package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new     ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.findElement(By.xpath("//span[text()='File']")).click();
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames+" frames: "+frames.size());
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("tinymce")).sendKeys("Test123");
        
        Thread.sleep(5000);
        driver.quit();

 

    }

}
