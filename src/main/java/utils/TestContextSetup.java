package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;
import utils.actions.GenericActionUtils;

import java.util.Map;

public class TestContextSetup {
    public Base base;
    public PageObjectManager pageObjectManager;
    public GenericActionUtils genericActionUtils;
    public WebDriver driver;

    //elements to persist
    public String productName;



    public TestContextSetup(){
        base = new Base();
        this.pageObjectManager = new PageObjectManager(base.WebdriverManager());
        genericActionUtils = new GenericActionUtils(base.WebdriverManager());
    }
}
