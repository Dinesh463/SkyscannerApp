package com.skyscanner.stepdefinations;

import java.net.MalformedURLException;

import org.testng.Assert;

import com.skyscanner.constants.Constant;
import com.skyscanner.pageobject.BookingSelectionPage;
import com.skyscanner.pageobject.FlightDetailsPage;
import com.skyscanner.pageobject.LandingPage;
import com.skyscanner.pageobject.LoginPage;
import com.skyscanner.util.HookBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkyScannerStepDefinations extends HookBase {
	LandingPage landingPage;
	LoginPage loginPage;
	BookingSelectionPage bookingSelectionPage;
	FlightDetailsPage flightDetailsPage;

	@Before("@Booking")
	public void startUp() throws MalformedURLException, Exception {
		initialize();
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		bookingSelectionPage = new BookingSelectionPage();
		flightDetailsPage = new FlightDetailsPage();
	}

	@After
	public void shutDown() {
		tearDown();
	}

	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		Assert.assertTrue(landingPage.isFirstPageTextDisplayed());
		landingPage.clickNextButton();
		landingPage.clickNextButton();
	}

	@Given("^the application is launched$")
	public void the_application_is_launched() throws Throwable {
		Assert.assertTrue(loginPage.isLoginTexttDisplayed());
	}

	@When("^I login as an existing user \"([^\"]*)\" with  password \"([^\"]*)\"$")
	public void i_login_as_an_existing_user_with_password(String username, String password) throws Throwable {
		Assert.assertTrue(loginPage.isClickLoginShown());
		String loggedInDetail = loginPage.login(username, password);
		Assert.assertEquals(loggedInDetail, Constant.SUCCESS);
	}

	@Then("^I should see the booking pages$")
	public void i_should_see_the_booking_pages() throws Throwable {
		Assert.assertTrue(bookingSelectionPage.isBookingPageDisplayed());
	}

	@When("^I search flights from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\" for a \"([^\"]*)\" flights for \"([^\"]*)\" members$")
	public void i_search_flights_from_to_on_for_a_flights_for_members(String usrSrcAirport, String usrDestAirport,
			String journeyDate, String directOnly, String members) throws Throwable {

		bookingSelectionPage.searchFlights(usrSrcAirport, usrDestAirport, journeyDate, directOnly, members);
		Assert.assertTrue(flightDetailsPage.isFlightDetailListShown());
	}

	@When("^I sort by \"([^\"]*)\" fastest flights$")
	public void i_sort_by_fastest_flights(String sortBy) throws Throwable {
		flightDetailsPage.sortFlightByDuration(sortBy);
		Assert.assertTrue(flightDetailsPage.isFlightDetailListShown());
	}

	@Then("^I should be able to select the first flight$")
	public void i_should_be_able_to_select_the_first_flight() throws Throwable {
		Assert.assertTrue(flightDetailsPage.isDirectFlightAvailable());
		String status = flightDetailsPage.checkTheDirectFlightDetails();
		Assert.assertEquals(status, Constant.SUCCESS);
	}
}
