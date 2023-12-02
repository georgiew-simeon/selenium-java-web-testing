package bg.pragmatic.pages.admin;

import bg.pragmatic.core.BasePage;
import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminLogin extends BasePage  {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector("button.btn-primary");
    private static final By LOGIN_FORM_VALIDATION_MESSAGE_ABOVE_FORM = By.cssSelector(".alert-danger");

    /**
     * Opens the admin area of shop.pragmatic.bg/admin
     */
    public static void open() {
        Browser.driver.get("https://shop.pragmatic.bg/admin");
    }

    /**
     * Logs into the admin area of shop.pragmatic.bg with
     * the provided credentials as arguments
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        click(LOGIN_BUTTON);
    }

    /**
     * Asserts that the validation message which will appear above the login form
     * on the admin login page is as expected based on the provided arguments to the parameters
     *
     * @param expectedFormValidationMessage the validation message you expect to be present above the login form
     * @param messageOnFailure the message that will appear in your reports in case if test failure
     */
    public static void verifyFormValidationMessage(String expectedFormValidationMessage, String messageOnFailure) {
        String actualFormValidationMessage = getText(LOGIN_FORM_VALIDATION_MESSAGE_ABOVE_FORM);
        Assert.assertTrue(actualFormValidationMessage.contains(expectedFormValidationMessage), messageOnFailure);

    }
}
