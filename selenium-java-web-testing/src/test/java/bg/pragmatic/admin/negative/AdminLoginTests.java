package bg.pragmatic.admin.negative;

import bg.pragmatic.core.BaseTest;
import bg.pragmatic.pages.admin.AdminLogin;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {


    @Test
    public void unsuccessfulLogin() {
        AdminLogin.open();
        AdminLogin.login("dasfasdfasd","asdfasdf");
        AdminLogin.verifyFormValidationMessage("No match for Username and/or Password.",
                "the validation message when wrong credentials are input is not as expected");
    }




}
