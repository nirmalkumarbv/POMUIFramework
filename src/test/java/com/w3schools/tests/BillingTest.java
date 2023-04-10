package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.BillingPage;

public class BillingTest extends LoginTest{
	
	@Test
	public void billing() {
		
		loginW3Schools();
		
		BillingPage bp = PageFactory.initElements(driver, BillingPage.class);
		
		bp.clickBilling();
		
		bp.screenShot("billing");
		
		
		
		
	}

}
