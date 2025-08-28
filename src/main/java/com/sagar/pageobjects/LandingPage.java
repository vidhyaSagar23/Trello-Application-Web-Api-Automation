package com.sagar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[contains(text(), 'Log in')]")
    WebElement loginOption;

    public LoginPage clickLoginOption(){
        loginOption.click();
        return new LoginPage(driver);
    }

    public void goTo(String uri) {
        driver.get(uri);
    }
}
