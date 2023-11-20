package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver WebdriverManager(){
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/java/configuration/config.properties"
            );
            prop.load(fis);
            String url = prop.getProperty("url");
            String browserName = prop.getProperty("browser");
            if ( driver == null ) {
                if (browserName.equalsIgnoreCase("chrome")){
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } else if (browserName.equalsIgnoreCase("firefox")) {
                    //firefox code
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.get(url);
            }

        }catch (Exception e ){
            System.out.println("Proerties error: " + e.getMessage());
        }

        return driver;
    }


}
