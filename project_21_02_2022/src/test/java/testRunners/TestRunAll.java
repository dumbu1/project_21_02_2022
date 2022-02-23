package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features={"src\\test\\resources\\features\\page1.feature","src\\test\\resources\\features\\page2.feature"},
		glue= {"stepDefintion","myHooks"},
		monochrome = true,
		dryRun = false
)
public class TestRunAll extends AbstractTestNGCucumberTests{

}
