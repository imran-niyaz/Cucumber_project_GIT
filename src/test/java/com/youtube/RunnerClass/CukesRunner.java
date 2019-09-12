package com.youtube.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
		features = "src/test/resources/features",
		glue = "com/youtube/StepDefs",
		dryRun = false,
		tags = "@wip"
		
		)

public class CukesRunner {
	
	
	

}
