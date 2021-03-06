package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().window().
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dropDown = driver.findElement(By.id("select-demo"));
//select class is used to select elements from a drop down
//it can be initialized by passing the drop down Webelement type in its constructor
		
		Select dropDownMenu = new Select(dropDown);
//		dropDownMenu.selectByVisibleText("Tuesday");
		List<WebElement> opList = dropDownMenu.getOptions();
		for(WebElement I:opList) {
			System.out.println(I.getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
