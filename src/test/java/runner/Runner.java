package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinitions",
monochrome = true,
plugin = {"html:src/test/reports/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends AbstractTestNGCucumberTests {
}
