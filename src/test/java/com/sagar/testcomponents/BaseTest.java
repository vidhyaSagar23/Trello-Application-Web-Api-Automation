package com.sagar.testcomponents;

import com.sagar.pageobjects.LandingPage;
import com.sagar.utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

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
        if(browser.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        }
    }
}
