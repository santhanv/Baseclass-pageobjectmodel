package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//features",
					glue="com.flipkart.stepdefinition",
					monochrome=true,
					dryRun=false,
					tags= {"@one"})

public class TestRunner {

}
