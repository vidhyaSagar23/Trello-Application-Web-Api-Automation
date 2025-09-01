package com.sagar.testcomponents;

import com.sagar.pageobjects.LandingPage;
import com.sagar.utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    public Utilities utilities = new Utilities();
    public Properties applicationProperties;
    public LandingPage landingPage;

    @BeforeMethod
    public void beforeMethod(){
         initializeDriver();
         landingPage = new LandingPage(driver);
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

    public void initializeDriver() {
        applicationProperties = utilities.loadProperties("Application.properties");
        String browser = applicationProperties.getProperty("browser");
        boolean headless = Boolean.parseBoolean(applicationProperties.getProperty("headless"));
        ChromeOptions options = new ChromeOptions();
        if(headless){
            options.addArguments("--headless=new", "--window-size=1920,1080");
        }
        if(browser.equals("chrome")){
            driver = new ChromeDriver(options);
            if(!headless){
                driver.manage().window().maximize();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
}