package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.w3schools.utils.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="current-password")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath="//div[text()='My learning']")
	WebElement learning;
	
	public void setUsername(String user)
	{
		//username.sendKeys(user);
		//using BaseTest method to type text
		waitForElement(username);
		typeText(username,user);
	}
	
	public void setPassword(String pass)
	{
		//password.sendKeys(pass);
		waitForElement(password);
		typeText(password,pass);
	}
	
	public void clickLogin() 
	{
		//login.click();
		waitForElement(login);
		clickAction(login);
	}

	public void  waitForLearning()
	{
		waitForElement(learning);
		
	}
}
