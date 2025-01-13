package com.qa.janani.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/qa/janani/resource/feature", 
    glue = {"com.qa.janani.stepDefinitions"},  
    dryRun = false,         
    plugin = {"pretty", "json:target/cucumber.json"}


)
public class TestRunner {

    
    

}

