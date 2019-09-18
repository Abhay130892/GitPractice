package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Abhay Deshpande\\eclipse-workspace\\cucumberbddArtifact\\src\\test\\java\\Features\\Login.feature",
glue={"stepDefination"},plugin={"pretty","html:target/cucmber-report"})


public class TestRunner 
{

	
	
}
