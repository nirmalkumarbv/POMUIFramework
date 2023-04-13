package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class CoursesAndExams2Page extends BaseTest{
	
	@FindBy(linkText="Courses & Exams")
	WebElement courses;
	
	public void coursesClick() {
		clickAction(courses);
	}
	
	@FindBy(xpath="//button[text()='Browse all exams']")
	WebElement browseall;
	
	public void browseAllExams() {
		clickAction(browseall);
	}
	
	@FindBy(name="q")
	WebElement textbox;
	
	public void typingtextbox(String ele) {
		typeText(textbox, ele);
	}
	
	@FindBy(xpath="(//strong[text()='Learn Java'])[1]")
	WebElement search1;
	
	public void searchlist1() {
		clickAction(search1);
	}

}
