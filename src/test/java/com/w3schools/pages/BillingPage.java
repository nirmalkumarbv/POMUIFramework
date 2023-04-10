package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class BillingPage extends BaseTest{
	
	@FindBy(linkText="Billing")
	WebElement billing;
	
	public void clickBilling() {
		clickAction(billing);
	}

}
