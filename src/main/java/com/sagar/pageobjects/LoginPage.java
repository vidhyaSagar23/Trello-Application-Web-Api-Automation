package com.sagar.pageobjects;

import com.sagar.abstractcomponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponents {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Log in to continue']")
    WebElement loginToContinueText;

    @FindBy(id = "username-uid1")
    WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@id='login-submit']/span")
    WebElement continueBtn;

    public boolean verifyLoginToContinueTextIsDisplayed(){
        return loginToContinueText.isDisplayed();
    }

    public void setUserName(String userEmail){
        userEmailInput.sendKeys(userEmail);
    }

    public void setPasswordInput(String password){
        passwordInput.sendKeys(password);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }
}

