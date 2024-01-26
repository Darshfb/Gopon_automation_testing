package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps", "tests"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
