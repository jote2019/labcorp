package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/search.feature",
		glue ="com.lapcorpTask",
		dryRun= true,
	     monochrome=true,
	     plugin= {"pretty","html:test-output"}
		)		

public class TestRunner extends AbstractTestNGCucumberTests{
	

}
