package com.skyscanner.pageobject;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyscanner.constants.Constant;
import com.skyscanner.util.HookBase;

public class BookingSelectionPage extends HookBase {

	@FindBy(id="net.skyscanner.android.main:id/flights_icon")
	WebElement flightIcon;

	@FindBy(xpath="//*[@text='ONE WAY']")
	WebElement oneWayTap;

	@FindBy(id="net.skyscanner.android.main:id/fromText")
	WebElement fromOption;

	@FindBy(id="net.skyscanner.android.main:id/searchBoxEditText")
	WebElement searchBoxEditText;

	@FindBy(id="net.skyscanner.android.main:id/autosuggest_root_layout")
	WebElement autoSuggestLayout;

	@FindBy(id="net.skyscanner.android.main:id/auto_cell_title")
	List<WebElement> airports;

	@FindBy(id="net.skyscanner.android.main:id/toText")
	WebElement toText;

	@FindBy(id="net.skyscanner.android.main:id/departureHolder")
	WebElement departureHolder;

	@FindBy(id="net.skyscanner.android.main:id/isDirectSwitch")
	WebElement isDirectSwitch;

	@FindBy(id="net.skyscanner.android.main:id/searchButton")
	WebElement searchButton;

	@FindBy(id="net.skyscanner.android.main:id/adult_text")
	WebElement memberText;

	@FindBy(id="net.skyscanner.android.main:id/adult_picker")
	WebElement memberPicker;

	@FindBy(className="android.widget.TextView")
	List<WebElement> memberPickerList;

	@FindBy(id="net.skyscanner.android.main:id/md_buttonDefaultPositive")
	WebElement defaultPositiveButton;

	@FindBy(id="net.skyscanner.android.main:id/fab")
	WebElement fabButton;
	
	@FindBy(id="net.skyscanner.android.main:id/sortFilterBarSortAndFilterButton")
	WebElement sortFilterButton;
	
	@FindBy(id="net.skyscanner.android.main:id/toolbarTitle")
	WebElement toolBarTitle;

	public BookingSelectionPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isBookingPageDisplayed() {
		return flightIcon.isDisplayed();
	}
	
	private void checkIfInputPresentInAiports(String input) {
		searchBoxEditText.sendKeys(input);
		waitForElement(autoSuggestLayout);
		List<WebElement> sourceAirports = airports;
		for (WebElement source : sourceAirports) {
			if (source.getText().contains(input)) {
				source.click();
				break;
			}
		}
	}

	private void selectIfDirectOFF(String directOnly) {
		boolean isDirectRequired = Boolean.parseBoolean(directOnly);
		if (isDirectRequired) {
			if (isDirectSwitch.getAttribute("text").equals(Constant.OFF)) {
				isDirectSwitch.click();
			}
		}
	}

	private void selectMembers(String members) {
		memberText.click();
		memberPicker.click();

		List<WebElement> list = memberPickerList;
		for (WebElement val : list) {
			if (val.getAttribute("text").contains(members)) {
				val.click();
				break;
			}
		}
	}
	
	private void initialStep() {
		flightIcon.click();
		oneWayTap.click();
	}
	
	private void selectToAndFromAirport(String usrSrcAirport, String usrDestAirport) {
		fromOption.click();
		checkIfInputPresentInAiports(usrSrcAirport);
		toText.click();
		checkIfInputPresentInAiports(usrDestAirport);
		departureHolder.click();
		waitForElement(toolBarTitle);
	}
	
	private void selectJourneyDateAndDirectFlight(String journeyDate, String directOnly) {
		driver.findElement(By.xpath(String.format("//*[@content-desc='%s']", journeyDate))).click();
		selectIfDirectOFF(directOnly);
		searchButton.click();
	}
	
	public void searchFlights(String usrSrcAirport, String usrDestAirport, String journeyDate, String directOnly, String members) throws InterruptedException {
		initialStep();
		selectToAndFromAirport(StringUtils.trimToEmpty(usrSrcAirport), StringUtils.trimToEmpty(usrDestAirport));
		selectJourneyDateAndDirectFlight(journeyDate, directOnly);
		selectMembers(members);
	
		waitForElement(defaultPositiveButton);
		defaultPositiveButton.click();
		fabButton.click();
		waitForElement(sortFilterButton);
	}
}
