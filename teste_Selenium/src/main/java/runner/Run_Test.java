package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
				 glue = "steps", 
				 plugin = {"pretty","html:build/reports/cucumber","json:build/reports/cucumber-tests/test.json"},
				 tags = "@CompleteForm")
public class Run_Test {
	
}
