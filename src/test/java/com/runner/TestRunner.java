package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="com.stepdefinition",dryRun=false,monochrome=true,
plugin= {"rerun:rerun/failed_Scenarios.txt",
		"pretty","html:target/html-report/cucumber"})

public class TestRunner {

}
