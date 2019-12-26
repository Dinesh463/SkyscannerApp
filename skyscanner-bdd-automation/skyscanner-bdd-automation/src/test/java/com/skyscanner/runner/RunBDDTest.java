package com.skyscanner.runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Uncomment @RunWith if you are using Junit to run Test 
//@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//com//skyscanner//features" }, 
                 glue = { "com.skyscanner.stepdefinations", "com.skyscanner.util" }, 
                 plugin = { "pretty", "html:target/cucumber" }, 
                 tags = { "@Booking" }
)
@Test
public class RunBDDTest extends AbstractTestNGCucumberTests {

}