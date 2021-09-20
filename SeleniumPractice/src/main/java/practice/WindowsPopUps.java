package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopUps {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://html.com/input-type-file/");
		
//		WebElement fileupload = driver.findElement(By.xpath("//input[@value='fileupload']"));
//		System.out.println(fileupload);
		driver.findElement(By.xpath("//input[@value='fileupload']")).sendKeys("C:\\Users\\Shady\\Desktop\\testUpload.txt");
		
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

}
