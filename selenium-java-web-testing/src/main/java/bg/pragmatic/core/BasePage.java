package bg.pragmatic.core;

import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;

public class BasePage {

    /**
     * Gets the text of an element including its sub elements
     * based on a provided locator
     *
     * @param locator the locator to the element that contains text u wanna get
     * @return the text that is contained within the element and its all sub elements based on the locator
     */
    protected static String getText(By locator) {
        return Browser.driver.findElement(locator).getText();
    }


    /**
     * Types a text into an element located by some locator
     *
     * @param locator the locator to the element you wanna type in
     * @param text the text you wanna type in that element
     */
    protected static void type(By locator, String text) {
        Browser.driver.findElement(locator).sendKeys(text);
    }


    /**
     * Clicks on an element based on a provided locator to it
     * @param locator the locator to the element you wanna click on
     */
    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }
}
