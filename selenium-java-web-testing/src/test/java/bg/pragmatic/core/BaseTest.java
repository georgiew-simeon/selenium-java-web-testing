package bg.pragmatic.core;

import bg.pragmatic.utils.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setup() {
        Browser.open();
    }




    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }
}
