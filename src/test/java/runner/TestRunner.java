package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", //the path of the feature files
        glue={"stepDefinitions", "hooks"}, //the path of the step definition files
        plugin= {"pretty","html:cucumber-html-report", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true //display the console output in a proper readable format
//        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)
public class TestRunner {}
