$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SkyScanner.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Dinesh Vucha"
    }
  ],
  "line": 2,
  "name": "Actions on Skyscanner App",
  "description": "",
  "id": "actions-on-skyscanner-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Search and selecting flight",
  "description": "",
  "id": "actions-on-skyscanner-app;search-and-selecting-flight",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Booking"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login as an existing user \"\u003cusername\u003e\" with  password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the booking pages",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search flights from \"\u003csourceAirport\u003e\" to \"\u003cdestinationAirport\u003e\" on \"\u003cdate\u003e\" for a \"\u003cdirectOnly\u003e\" flights for \"\u003cadults\u003e\" members",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I sort by \"\u003csortBy\u003e\" fastest flights",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to select the first flight",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "actions-on-skyscanner-app;search-and-selecting-flight;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "sourceAirport",
        "destinationAirport",
        "adults",
        "date",
        "directOnly",
        "sortBy"
      ],
      "line": 17,
      "id": "actions-on-skyscanner-app;search-and-selecting-flight;;1"
    },
    {
      "cells": [
        "skyscannerpalo@gmail.com",
        "Test@1234",
        "Singapore",
        "Hyderabad",
        "2",
        "10 January 2020",
        "true",
        "Duration"
      ],
      "line": 18,
      "id": "actions-on-skyscanner-app;search-and-selecting-flight;;2"
    },
    {
      "cells": [
        "skyscannerpalo@gmail.com",
        "Test@1234",
        "Singapore",
        "Cape",
        "3",
        "18 January 2020",
        "true",
        "Duration"
      ],
      "line": 19,
      "id": "actions-on-skyscanner-app;search-and-selecting-flight;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 56133683300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_launch_the_application()"
});
formatter.result({
  "duration": 6587701800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search and selecting flight",
  "description": "",
  "id": "actions-on-skyscanner-app;search-and-selecting-flight;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Booking"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login as an existing user \"skyscannerpalo@gmail.com\" with  password \"Test@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the booking pages",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search flights from \"Singapore\" to \"Hyderabad\" on \"10 January 2020\" for a \"true\" flights for \"2\" members",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I sort by \"Duration\" fastest flights",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to select the first flight",
  "keyword": "Then "
});
formatter.match({
  "location": "SkyScannerStepDefinations.the_application_is_launched()"
});
formatter.result({
  "duration": 1615419800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skyscannerpalo@gmail.com",
      "offset": 29
    },
    {
      "val": "Test@1234",
      "offset": 71
    }
  ],
  "location": "SkyScannerStepDefinations.i_login_as_an_existing_user_with_password(String,String)"
});
formatter.result({
  "duration": 6654824200,
  "status": "passed"
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_should_see_the_booking_pages()"
});
formatter.result({
  "duration": 1525849600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Singapore",
      "offset": 23
    },
    {
      "val": "Hyderabad",
      "offset": 38
    },
    {
      "val": "10 January 2020",
      "offset": 53
    },
    {
      "val": "true",
      "offset": 77
    },
    {
      "val": "2",
      "offset": 96
    }
  ],
  "location": "SkyScannerStepDefinations.i_search_flights_from_to_on_for_a_flights_for_members(String,String,String,String,String)"
});
formatter.result({
  "duration": 31281653900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Duration",
      "offset": 11
    }
  ],
  "location": "SkyScannerStepDefinations.i_sort_by_fastest_flights(String)"
});
formatter.result({
  "duration": 3822278800,
  "status": "passed"
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_should_be_able_to_select_the_first_flight()"
});
formatter.result({
  "duration": 5227857400,
  "status": "passed"
});
formatter.after({
  "duration": 1055464100,
  "status": "passed"
});
formatter.before({
  "duration": 33607831700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launching application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_launch_the_application()"
});
formatter.result({
  "duration": 4216579600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search and selecting flight",
  "description": "",
  "id": "actions-on-skyscanner-app;search-and-selecting-flight;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Booking"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login as an existing user \"skyscannerpalo@gmail.com\" with  password \"Test@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the booking pages",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search flights from \"Singapore\" to \"Cape\" on \"18 January 2020\" for a \"true\" flights for \"3\" members",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I sort by \"Duration\" fastest flights",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to select the first flight",
  "keyword": "Then "
});
formatter.match({
  "location": "SkyScannerStepDefinations.the_application_is_launched()"
});
formatter.result({
  "duration": 1326053300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skyscannerpalo@gmail.com",
      "offset": 29
    },
    {
      "val": "Test@1234",
      "offset": 71
    }
  ],
  "location": "SkyScannerStepDefinations.i_login_as_an_existing_user_with_password(String,String)"
});
formatter.result({
  "duration": 4750855300,
  "status": "passed"
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_should_see_the_booking_pages()"
});
formatter.result({
  "duration": 1227275200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Singapore",
      "offset": 23
    },
    {
      "val": "Cape",
      "offset": 38
    },
    {
      "val": "18 January 2020",
      "offset": 48
    },
    {
      "val": "true",
      "offset": 72
    },
    {
      "val": "3",
      "offset": 91
    }
  ],
  "location": "SkyScannerStepDefinations.i_search_flights_from_to_on_for_a_flights_for_members(String,String,String,String,String)"
});
formatter.result({
  "duration": 31044069600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Duration",
      "offset": 11
    }
  ],
  "location": "SkyScannerStepDefinations.i_sort_by_fastest_flights(String)"
});
formatter.result({
  "duration": 3827286500,
  "status": "passed"
});
formatter.match({
  "location": "SkyScannerStepDefinations.i_should_be_able_to_select_the_first_flight()"
});
formatter.result({
  "duration": 148772900,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat org.testng.Assert.assertTrue(Assert.java:52)\r\n\tat com.skyscanner.stepdefinations.SkyScannerStepDefinations.i_should_be_able_to_select_the_first_flight(SkyScannerStepDefinations.java:80)\r\n\tat ✽.Then I should be able to select the first flight(SkyScanner.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 533098500,
  "status": "passed"
});
});