package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;
import utils.actions.Actions;

public class LandingPage{

    WebDriver driver;
    Actions ac = new Actions();

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");

    By topDeals = By.linkText("Top Deals");

    By increment = By.cssSelector("a.increment");
    By addToCartBtn = By.cssSelector(".product-action button");

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchItem(String name){
        ac.type(driver, search, name);
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }

    public void selectTopDeals(){
        ac.click(driver, topDeals);
    }

    public String getTittleLandingPage(){
        return driver.getTitle();
    }

    public void addToCart(){
        ac.click(driver, addToCartBtn);
    }

    public void incrementQuantity(int qty){
        int i = qty - 1;
        while ( i > 0 ) {
            driver.findElement(increment).click();
            i--;
        }

}}
