package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})
public class Runner {

}
