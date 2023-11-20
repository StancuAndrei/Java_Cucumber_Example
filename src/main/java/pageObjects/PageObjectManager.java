package pageObjects;

import org.openqa.selenium.WebDriver;
import utils.Base;

public class PageObjectManager extends Base {

    private LandingPage landingPage;

    private OffersPage offersPage;
    private CheckoutPage checkoutPage;

    public PageObjectManager(WebDriver driver){
        this.driver= driver;
    }


    public LandingPage getLandingPage(){
        landingPage = new LandingPage(driver);
        return landingPage;
    }

    public OffersPage getOffersPage(){
        return offersPage = new OffersPage(driver);
    }

    public CheckoutPage getCheckoutPage(){ return checkoutPage = new CheckoutPage(driver);}


}
