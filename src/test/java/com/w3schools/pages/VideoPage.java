package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class VideoPage extends BaseTest {

	// 2. Click on Videos tab after logging in. Do a window handling to the videos
	// tab and take a screenshot of the same
	
	@FindBy(xpath="//div[text()='Videos']")
	WebElement videos;
	
	public void clickVideos() {
		waitForElement(videos);
		clickAction(videos);
	}

	
}
