package baseTest;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class BaseTest {

    protected static WebDriver driver;

    protected LoginPage openLoginPage() {
        driver.get("https://www.saucedemo.com");
        return new LoginPage(driver);
    }


}
