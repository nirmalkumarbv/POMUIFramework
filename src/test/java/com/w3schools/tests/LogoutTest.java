package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.LogoutPage;

public class LogoutTest extends LoginTest{

	@Test
	public void logout() {
		
		loginW3Schools();
		
		LogoutPage logout = PageFactory.initElements(driver, LogoutPage.class);
		
		logout.clickLogout();
		
	}
	
}
