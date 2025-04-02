package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/moviefeatures",glue= {"moviedefinition"}, plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-reports.html",
        "junit:target/cucumber.xml"
    },tags="@smoke")

public class TestRunner {

}
