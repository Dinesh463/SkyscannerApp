package com.skyscanner.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyscanner.constants.Constant;
import com.skyscanner.util.HookBase;

public class FlightDetailsPage extends HookBase {

	@FindBy(id="net.skyscanner.android.main:id/sortFilterBarSortAndFilterButton")
	WebElement sortFilterButton;

	@FindBy(id="net.skyscanner.android.main:id/sortHolder")
	WebElement sortHolder;

	@FindBy(xpath="//android.widget.TextView[@text='Duration']")
	WebElement durationText;

	@FindBy(id="net.skyscanner.android.main:id/sortFilterBarDetailsText")
	WebElement sortFilterDetailText;

	@FindBy(id="net.skyscanner.android.main:id/priceText")
	List<WebElement> priceText;

	@FindBy(id="net.skyscanner.android.main:id/sortFilterBarDetailsText")
	WebElement sortFilterBarText;
	
	@FindBy(id="net.skyscanner.android.main:id/toolbarTitle")
	WebElement summaryView;

	public FlightDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isFlightDetailListShown() {
		return sortFilterDetailText.isDisplayed();
	}

	public boolean isDirectFlightAvailable() {
		String searchResult = sortFilterDetailText.getAttribute(Constant.TEXT);
		return (searchResult.charAt(0) != '0');
	}
	
	public void sortFlightByDuration(String duration) {
		if (duration.equalsIgnoreCase(Constant.SORT_DURATION)) {
			sortFilterButton.click();
			sortHolder.click();
			durationText.click();
		}
	}
	
	public String checkTheDirectFlightDetails() throws InterruptedException {
		if (isDirectFlightAvailable()) {
			sortFilterDetailText.click();
			 waitForElement(priceText.get(0));
			 if (priceText.size() > 0 ) {
				 priceText.get(0).click();
			 }
			 waitForElement(summaryView);
			summaryView.getText().equalsIgnoreCase(Constant.SUMMARY_VIEW); 
			return Constant.SUCCESS;
		}
		return Constant.FAIL;
	}

}
