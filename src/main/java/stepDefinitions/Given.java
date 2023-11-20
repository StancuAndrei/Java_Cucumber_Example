package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;


public class Given {
    WebDriver driver;
    TestContextSetup testContextSetup;
    LandingPage landingPage;

    public Given(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }

    @io.cucumber.java.en.Given("user is on the correct website")
    public void user_is_on_the_correct_website() {
        testContextSetup.base.WebdriverManager();
        Assert.assertTrue(landingPage.getTittleLandingPage().contains("GreenKart"));
    }


}
