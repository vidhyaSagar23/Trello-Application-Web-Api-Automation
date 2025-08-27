package com.sagar.testcomponents;

import com.sagar.utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class BaseTest {
    private final Utilities utilities = new Utilities();
    WebDriver driver;
    @BeforeMethod
    public void beforeSuite(){
        File file = utilities.getFileObject("src/main/java/com/sagar/resources/Application.properties");
        FileReader reader = utilities.getFileReader(file);
        Properties properties = utilities.loadProperties(reader);
        String uri = properties.getProperty("baseuri");
        String browser = properties.getProperty("browser");
        initializeDriver(browser);
        System.out.println("initialized");
        driver.get(uri);
        driver.manage().window().maximize();
        System.out.println("maximized");
    }

    public void initializeDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
    }
}
