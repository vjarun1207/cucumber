package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="rerun/failed_Scenarios.txt",glue="com.stepdefinition")
public class ReRunner {

}
