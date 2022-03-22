package com.hackDoc;

import cucumber.api.java.en.When;

public class steps {

	@When("I am on the following page")
	public void test() {
		System.out.println("Hi there I am Cucumber");
	}

}
