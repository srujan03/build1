package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {
public static void dragAndDrop(WebDriver driver) throws InterruptedException {
                
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        
//        System.out.println(source);
//        System.out.println(destination);
        
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.dragAndDrop(source, destination).build().perform();
        
        
        Thread.sleep(10000);
        driver.quit();
        
    }
    
    public static void actionDemo(WebDriver driver) throws InterruptedException {
        
        
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();        
    
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        
        Actions action = new Actions(driver);
        
        action.moveToElement(userName).click().keyDown(Keys.SHIFT).sendKeys("admin").doubleClick().keyUp(Keys.SHIFT).build().perform();
        
        Thread.sleep(10000);
        driver.quit();
    }
    
    
    public static void jsExecuter(WebDriver driver) throws InterruptedException {
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(10000);
		driver.quit();
		
    }

 

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        actionDemo();
    	jsExecuter(driver);
    	
        
    }

}
