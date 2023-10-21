package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Locators
    private final By userNameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("div.error-message-container");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param username the username used to login
     * @param password the password used to login
     * @return a new instance of InventoryPage and passing the driver to it
     */
    public InventoryPage login(String username, String password) {
        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    }

    /**
     * @return the error message display on the page
     */
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}
