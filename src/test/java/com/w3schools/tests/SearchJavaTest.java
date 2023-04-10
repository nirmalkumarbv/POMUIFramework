package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.LoginPage;
import com.w3schools.pages.SearchJavaPage;
import com.w3schools.utils.BaseTest;

public class SearchJavaTest extends BaseTest {
	
	@Test
	public void searchJava() {
	
		LoginTest logintest = PageFactory.initElements(driver, LoginTest.class);
		logintest.loginW3Schools();
		
		SearchJavaPage search = PageFactory.initElements(driver, SearchJavaPage.class);
		
		search.clickBrowse();
		
		search.search();
		
		search.learnJavaClick();
		
	}

}
