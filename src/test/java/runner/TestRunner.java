package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
//        tags = "@unHappyScenario",
        dryRun = false,
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
