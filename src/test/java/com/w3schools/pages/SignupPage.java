package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class SignupPage extends BaseTest  {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="new-password")
	WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Sign up for free')]")
	WebElement signup;
	
	@FindBy(name="first_name")
	WebElement fname;
	
	@FindBy(name="last_name")
	WebElement lname;
	
	@FindBy(xpath="//span[text()='Continue']")
	WebElement continueclick;
	
	
	public void setUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickSignup()
	{
		signup.click();
	}
	
	public void firstName(String nameF) {
		fname.sendKeys(nameF);
	}
	
	public void lastName(String nameL) {
		lname.sendKeys(nameL);
	}
	
	public void clickContinue() {
		continueclick.click();
	}
	

}
