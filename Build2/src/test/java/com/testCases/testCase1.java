package com.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Pages.LoginPage;

public class testCase1 extends TestBase{
	LoginPage lp;
	@BeforeMethod
	public void setup() {initialize();
		lp = new LoginPage();
		
	}
	@Test
public void testOne() {
		String title = lp.gettingTitle();
		System.out.println(title);
}

}
