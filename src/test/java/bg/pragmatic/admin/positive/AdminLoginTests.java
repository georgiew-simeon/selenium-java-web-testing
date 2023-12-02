package bg.pragmatic.admin.positive;

import bg.pragmatic.core.BaseTest;
import bg.pragmatic.pages.admin.AdminDashboard;
import bg.pragmatic.pages.admin.AdminLogin;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {

    @Test
    public void successfulLogin() {
        AdminLogin.open();
        AdminLogin.login("admin", "parola123!");
        AdminDashboard.verifyPageHeading("Dashboard",
                "you were unable to login as the page heading Dashboard was not present.");
    }


}
