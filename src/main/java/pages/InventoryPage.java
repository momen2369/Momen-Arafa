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

    public boolean isInventoryPageOpen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productsHeader));
        return driver.getCurrentUrl().contains("inventory");
    }

    public boolean isProductsHeaderVisible() {
        try {
            driver.findElement(productsHeader);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
