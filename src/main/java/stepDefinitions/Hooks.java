package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

import java.io.File;

public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @After
    public void afterScenario(){
        testContextSetup.base.WebdriverManager().quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        WebDriver driver = testContextSetup.base.WebdriverManager();
        try{
            if ( scenario.isFailed() ) {
                File sourcePath = ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
                byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
                scenario.attach(fileContent, "image/png","image");
            }
        }catch (Exception e ){ e.printStackTrace();}
    }


}
