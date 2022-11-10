package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/java/feature/GoogleLaunch.feature","src/test/java/feature/FbLogin.feature"},
		features = {"src/test/java/feature/SeleniumProject1.feature"},
		glue = {"stepDefinition"}
		//tags = {"SB"} //run scenarios having tag as @SB
		//tags = {"@SB","@Sanity"} //AND condition
		//tags = {"@SB,@Regression"} //OR condition
		//tags = {"@Full"} //run all scenarios of the feature
		//tags = {"@Full","~@Regression"} //exclude tags using ~ 
		)

public class testRunner {

}
