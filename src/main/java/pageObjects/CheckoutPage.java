package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class CheckoutPage{

    WebDriver driver;
    By cartBag = By.cssSelector("[alt='Cart']");
    By checkoutButton = By.cssSelector("#root > div > header > div > div.cart > div.cart-preview.active > div.action-block > button");
    By promoButton = By.cssSelector(".promoBtn");
    By placeOrderButton = By.cssSelector("#root > div > div > div > div > button");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkoutItems(){
        driver.findElement(cartBag).click();
        driver.findElement(checkoutButton).click();

    }

    public boolean verifyPromoBtn(){
        return driver.findElement(promoButton).isDisplayed();
    }

    public boolean verifyPlaceOrder(){
        return driver.findElement(placeOrderButton).isDisplayed();
    }


}
