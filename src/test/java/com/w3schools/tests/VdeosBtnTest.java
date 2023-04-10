package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.w3schools.pages.VideoPage;

public class VdeosBtnTest extends LoginTest{
	
	@Test
	public void videoBtnTest() {
		
		loginW3Schools();
		
		VideoPage video = PageFactory.initElements(driver, VideoPage.class);
		
		video.clickVideos();
		
		video.windowHandling();
		
		video.screenShot("Videos");
		
	}

}
