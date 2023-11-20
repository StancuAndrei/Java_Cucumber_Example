package stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class When {
    WebDriver driver;
    TestContextSetup testContextSetup;


    public When(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @io.cucumber.java.en.When("^user searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        testContextSetup.pageObjectManager.getLandingPage().searchItem(shortName);
        Thread.sleep(4000);
        testContextSetup.productName = testContextSetup.pageObjectManager.getLandingPage().getProductName().split("-")[0].trim();
        System.out.println(testContextSetup.productName + " is extracted from home page");
    }


}
