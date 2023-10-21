package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    //locators
    private final By productsHeader = By.xpath("//span[contains(.,'Products')]");
    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * this method checks if the opened URL is the inventory page URL
     * @return true if the URL matches
     */
    public boolean isInventoryPageOpen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productsHeader));
        return driver.getCurrentUrl().contains("inventory");
    }

    /**
     * this method checks if the products header is displayed on screen
     * @return true if the header is displayed
     */
    public boolean isProductsHeaderVisible() {
        try {
            driver.findElement(productsHeader);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
