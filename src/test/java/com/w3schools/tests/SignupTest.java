package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.w3schools.pages.SignupPage;

public class SignupTest extends SignupPage{
	
	@Test
	public void signUpW3Schools() {
		
		try {
			launchBrowser("https://profile.w3schools.com/sign-up");
			
			SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
			
			signupPage.setUsername("gunasekaranandhan24@gmail.com");
			
			signupPage.setPassword("9585148924@Gu");
			
			signupPage.clickSignup();
			
			signupPage.firstName("Gunasekar");
			
			signupPage.lastName("Aananadhan");
			
			signupPage.clickContinue();
			
			String signupTitle = "Sign up - W3Schools";
			
			Assert.assertEquals(driver.getTitle(), signupTitle);
		} catch (Exception e) {
			
			System.out.println("Problem while SignUp into w3Schools");
			e.printStackTrace();
		}
		
		
	}

}
