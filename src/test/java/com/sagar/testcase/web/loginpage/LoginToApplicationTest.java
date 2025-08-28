package com.sagar.testcase.web.loginpage;

import com.sagar.pageobjects.LoginPage;
import com.sagar.testcomponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToApplicationTest extends BaseTest {
    @Test
    public void verifyUserIsAbleToLogin() throws InterruptedException {
        landingPage.goTo(applicationProperties.getProperty("baseuri"));
        LoginPage loginPage = landingPage.clickLoginOption();
        Thread.sleep(1000);
        boolean isDisplayed = loginPage.verifyLoginToContinueTextIsDisplayed();
        Assert.assertTrue(isDisplayed);
        loginPage.setUserName(applicationProperties.getProperty("usermail"));
        loginPage.clickContinueBtn();
        loginPage.setPasswordInput(applicationProperties.getProperty("password"));
        loginPage.clickContinueBtn();
    }
}
