package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class Then {
    WebDriver driver;
    TestContextSetup testContextSetup;

    String offerPageProductName;


    public Then(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    public void switchToOfferpage(){
        //if( testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
        //pom = new PageObjectManager(testContextSetup.driver);
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDeals();
        testContextSetup.genericActionUtils.switchWindowToChild();
    }

    @io.cucumber.java.en.Then("^user searhed for same (.+) in offers page to check if the product exists$")
    public void user_searhed_for_same_shortname_in_offers_page_to_check_if_the_product_exists(String shortName) throws InterruptedException {
        switchToOfferpage();
        OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
        offersPage.searchItem(shortName);
        Thread.sleep(4000);
        offerPageProductName = offersPage.getProductName();

    }

    @And("validate product name matches with landing page")
    public void validate_product_name_in_offer_page(){
        Assert.assertEquals(testContextSetup.productName, this.offerPageProductName);
    }


}
