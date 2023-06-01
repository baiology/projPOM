package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue={"stepDefinitions", "hooks"},
        plugin= {"pretty","html:target/cucumber-html-report.html", "json:target/cucumber/Report.json"},
        monochrome = true
//        dryRun =
        //tags =
)
public class TestRunner {}
