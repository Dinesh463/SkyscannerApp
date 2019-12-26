#Author: Dinesh Vucha
Feature: Actions on Skyscanner App

  Background: Launching application
    Given I launch the application

  @Booking
  Scenario Outline: Search and selecting flight
    Given the application is launched
    When I login as an existing user "<username>" with  password "<password>"
    Then I should see the booking pages
    When I search flights from "<sourceAirport>" to "<destinationAirport>" on "<date>" for a "<directOnly>" flights for "<adults>" members
    And I sort by "<sortBy>" fastest flights
    Then I should be able to select the first flight

    Examples:
      | username                 | password   | sourceAirport | destinationAirport | adults | date            | directOnly | sortBy  | 
      | skyscannerpalo@gmail.com | Test@1234  | Singapore     | Hyderabad          | 2      | 10 January 2020 | true       | Duration |
      | skyscannerpalo@gmail.com | Test@1234  | Singapore     | Cape	           | 3      | 18 January 2020 | true       | Duration |