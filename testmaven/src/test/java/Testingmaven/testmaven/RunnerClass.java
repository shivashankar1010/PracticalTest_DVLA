package Testingmaven.testmaven;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "featurefiles",

		format = { "pretty", "html:target/Reports" }

		
		//test
)

public class RunnerClass {

	
}
