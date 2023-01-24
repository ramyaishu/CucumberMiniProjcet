package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/vanchinathanac/Desktop/CucumberSprint2/src/test/java/feature/main.feature"},
        glue = {"stepDefinition"},
            tags = {"smoke","regression"},plugin = {"pretty","html:target/html","json:target/report.json"},monochrome = true,
dryRun = false,strict = true)

public class mainTestRunner
{

}
