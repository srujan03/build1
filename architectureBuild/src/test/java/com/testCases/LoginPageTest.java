package com.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

import com.base.TestBase;
import com.pages.LoginPage;


public class LoginPageTest extends TestBase {
	LoginPage loginpage; 
//	public LoginPageTest() {
//		super();
//	}
	@BeforeMethod
	public void setup() {
		loginpage = new LoginPage();
		initialization();
	}
	@Test
	public void loginPageTitleTest() {	
		String title = loginpage.validateTitle();
		System.out.println(title);
		assertEquals(title, "OrangeHRM");
		
	}
	@AfterMethod
	public void quit() {
		closeSetup();
	}
	

}
