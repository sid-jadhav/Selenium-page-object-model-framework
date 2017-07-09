package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource/features",
		glue="com.org.api.SeleniumPageObjectModel.StepDefinations"
		)
public class Runner {
	
}
