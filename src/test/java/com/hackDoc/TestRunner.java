package com.hackDoc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features",
		glue= {"com.hackDoc"}
		)
public class TestRunner {
}
//mvn test -Dcucumber.options="--tags '@murali'"