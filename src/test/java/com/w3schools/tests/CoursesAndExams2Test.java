package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.CoursesAndExams2Page;

public class CoursesAndExams2Test extends LoginTest{
	
	@Test
	public void coursesAndExams2() {
		
		loginW3Schools();
		
		CoursesAndExams2Page ce2 = PageFactory.initElements(driver, CoursesAndExams2Page.class);
		
		ce2.coursesClick();
		
		ce2.browseAllExams();
		
		ce2.windowHandling();
		
		ce2.typingtextbox("Learn Java");
		
		ce2.searchlist1();
		
		
		
	}

}
