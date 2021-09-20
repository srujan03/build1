package com.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class LoginPage extends TestBase{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String gettingTitle() {
		return driver.getTitle();
	}

}
