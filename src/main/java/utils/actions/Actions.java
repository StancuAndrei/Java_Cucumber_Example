package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Base;

import java.time.Duration;

public class Actions extends Base {

    public boolean explicitWait(WebDriver driver, By el ){
        boolean flag = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try{
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(el)
            );
            flag = true;
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return flag;
    }

    public boolean type(WebDriver driver, By el, String text){
        boolean flag = false;
        try{
            if (explicitWait(driver, el)){
                driver.findElement(el).sendKeys(text);
                flag = true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return flag;
    }

    public boolean click(WebDriver driver, By el ){
        boolean flag = false;
        try{
            if (explicitWait(driver, el)){
                driver.findElement(el).click();
                flag = true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return flag;
    }

}
