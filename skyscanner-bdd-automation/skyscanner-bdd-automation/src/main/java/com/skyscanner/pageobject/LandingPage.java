package com.skyscanner.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyscanner.util.HookBase;

public class LandingPage extends HookBase {

	@FindBy(xpath="//*[@text='Flights, Hotels and Car hire']")
	WebElement firstPageText;

	@FindBy(xpath="//*[@text='NEXT']")
	WebElement nextButton;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickNextButton() {
		nextButton.click();
	}

	public boolean isFirstPageTextDisplayed() {
		return firstPageText.isDisplayed();
	}
}
