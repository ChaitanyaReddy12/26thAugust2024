package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"stepDefination"}, features = "Admin.feature")
public class TestRunner {
	
	
	
	

}
