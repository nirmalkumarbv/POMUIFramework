package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class CoursesAndExams1Page extends BaseTest {
	
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
	
	@FindBy(name="filter.v.price.gte")
	WebElement from;
	
	public void textfrom(String x) {
		typeText(from, x);
	}
	
	@FindBy(name="filter.v.price.lte")
	WebElement to;
	
	public void textTo(String x) {
		typeText(to, x);
	}
	
	@FindBy(linkText="HTML Certification Exam")
	WebElement html;
	
	public void htmlcourse() {
		clickAction(html);
	}

}
