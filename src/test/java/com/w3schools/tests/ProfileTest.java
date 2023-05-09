package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.tools.javac.jvm.Profile;
import com.w3schools.pages.LoginPage;
import com.w3schools.pages.ProfilePage;
import com.w3schools.utils.BaseTest;
import com.w3schools.utils.Reports;

@Listeners(Reports.class)
public class ProfileTest extends LoginTest{
	Reports report = new Reports();
	

	@Test
	public void prifileUpdating() {
		
		//report.setTCDesc("Validating Profile fuctionality" );
		loginW3Schools();
		
		ProfilePage profile = PageFactory.initElements(driver, ProfilePage.class);
		profile.clickProfile();
		profile.setFirstName("Gunasekar");
		profile.setLastName("Aanandhan");
		profile.clickEditButton();
		profile.clickEditButton();
		profile.nickName("GunasekarNew");
		profile.clickSave2();
		profile.ProfileBio("Hi, This is Gunasekar. \n I am a Mechanical Students ");
		profile.clickSave3();
	}
	
}
