package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.CoursesAndExams1Page;

public class CoursesAndExams1Test extends LoginTest{
	
	@Test
	public void coursesAndExams1() {
		
		loginW3Schools();
		
		CoursesAndExams1Page ce1 = PageFactory.initElements(driver, CoursesAndExams1Page.class);
		
		ce1.coursesClick();
		
		ce1.browseAllExams();
		
		ce1.windowHandling();
		
		ce1.textfrom("0");
		
		ce1.textTo("100");
		
		ce1.htmlcourse();
		
	}

}
