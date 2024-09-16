package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
glue= {"com.stepdefinition"},
plugin= {"pretty",
		"html:target/report.html",
		"json:target/Cucumber.json",
		"junit:target/Cucumber.xml"},
		monochrome=true)



public class TestRunner {

}
