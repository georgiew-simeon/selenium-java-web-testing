package bg.pragmatic.pages.admin;

import bg.pragmatic.core.BasePage;
import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdminDashboard extends BasePage {

    private static final By DASHBOARD_HEADING_H1 = By.cssSelector("div.container-fluid h1");


    /**
     * Asserts that the heading in the Dashboard page of the admin area is as expected based
     * on the provided arguments and requires a message on failure if the tests failure to appear in
     * your test reports
     *
     * @param expectedDashboardHeading the dashboard heading text you expect to be present in the page
     * @param messageOnFailure the message that will appear in your reports in case of test failure
     */
    public static void verifyPageHeading(String expectedDashboardHeading, String messageOnFailure) {
        Assert.assertEquals(getText(DASHBOARD_HEADING_H1), expectedDashboardHeading, messageOnFailure);
    }
}
