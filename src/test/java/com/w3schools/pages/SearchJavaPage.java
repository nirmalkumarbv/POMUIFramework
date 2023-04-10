package com.w3schools.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class SearchJavaPage extends BaseTest {

	// 3. Click on "My Learning"--> Browse Tutorials--> Search Tutorials--> "Learn
	// Java" --> click and open the "Learn Java" course

	@FindBy(xpath = "//button[text()=\"Browse tutorials\"]")
	WebElement browse;

	public void clickBrowse() {
		clickAction(browse);
	}

	@FindBy(xpath = "//input[@type='search']")
	WebElement search;

	public void search() {
		typeText(search, "Java Learn");
	}

	@FindBy(xpath = "//div[contains(text(),'Learn')]")
	List<WebElement> learn;

	public void learnJavaClick() {

		for (WebElement learnJava : learn) {
			if (learnJava.getText().equals("Learn Java")) {
				// clickAction(learnJava);
				jsClick(learnJava);
			}
		}

	}

}
