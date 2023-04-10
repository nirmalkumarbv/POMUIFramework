package com.w3schools.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class LogoutPage extends BaseTest{
	
    @FindBy(xpath="//div[text()='Log out']")
	WebElement logout;
	
	public void clickLogout() {
		clickAction(logout);
	}

}
