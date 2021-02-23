package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
				 glue = "steps", 
				 tags = "@FillVehicleDataForm")
public class Run_Test {
	
}
