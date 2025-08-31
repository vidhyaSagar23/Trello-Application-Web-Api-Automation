package com.sagar.pageobjects;

import com.sagar.abstractcomponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[contains(text(), 'Log in')]")
    WebElement loginOption;

    public LoginPage clickLoginOption() throws InterruptedException {
        Thread.sleep(10);
        loginOption.click();
        return new LoginPage(driver);
    }

    public void goTo(String uri) {
        driver.get(uri);
    }
}
