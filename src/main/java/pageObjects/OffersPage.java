package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;
import utils.actions.Actions;

public class OffersPage {

    WebDriver driver;
    Actions ac = new Actions();
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("tr td:nth-child(1)");

    public OffersPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchItem(String name){
        ac.type(driver, search, name);
    }

    public void getSearchText(String name){ driver.findElement(search).getText(); }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }



}
