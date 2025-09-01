package com.sagar.abstractcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    WebDriver driver;
    WebDriverWait wait;

    public AbstractComponents(WebDriver driver) {
        this.driver = driver;
        initializeWebDriverWait();
    }

    private void initializeWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
    }

    //    Waits unitl the element is visible
    public void waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //    Waits until the element is visible by the locator
    public void waitForVisibilityOfElementLocatedBy(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //    Wait until element is present in the DOM
    public void waitForPresenceOfElementLocatedBy(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //    Waits until element to be clickable
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //    Waits until element to be clickable by locator
    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    //    Waits until the element is not visible
    public void waitForElementNotVisible(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    //    Waits until the element is no longer visible or not present in the DOM.
    public void waitForElementNotVisible(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    //    waits until the element to be selected (radio, checkboxes, dropdowns)
    public void waitForElementToBeSelected(WebElement element) {
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }

    //    waits until the element to be selected (radio, checkboxes, dropdowns)
    public void waitForElementToBeSelected(By locator) {
        wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    //    wait until the Invisibility of all elements
    public void waits(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOfAllElements(element));
    }

    //    wait until element contains the text
    public void waitForTextToBePresentInElement(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    //    Waits until the located element contains the given text.
    public void waitForTextToBePresentInElementLocated(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    //    Waits until the element’s value attribute contains the given text.
    public void waitForTextToBePresentInElementValue(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
    }

    //    Waits until the frame is available, then switches to it.
    public void waitForFrameToBeAvailableAndSwitchToIt(WebElement element) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }

    //    Waits until the frame is available, then switches to it.
    public void waitForFrameToBeAvailableAndSwitchToIt(By locator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    //    Waits until the frame is available, then switches to it.
    public void waitForFrameToBeAvailableAndSwitchToIt(int index) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    //    Waits until the frame is available, then switches to it.
    public void waitForFrameToBeAvailableAndSwitchToIt(String frameName) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
    }
}
