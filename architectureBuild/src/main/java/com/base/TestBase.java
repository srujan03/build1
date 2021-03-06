package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browser = prop.getProperty("browser");
		String URL = prop.getProperty("URL");
		System.out.println(URL);
		System.out.println(browser);
		
		
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();}
		
		
		driver.manage().window().maximize();
		driver.get(URL);
	}
	public void closeSetup() {
		driver.quit();
	}

}