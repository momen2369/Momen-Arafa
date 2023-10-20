package stepDefinitions;

import baseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Given("the user is on the login screen")
    public void navigateToLoginScreen() {
        loginPage = openLoginPage();
    }

    @When("the user login using {string} and {string}")
    public void login(String username, String password) {
        inventoryPage = loginPage.login(username, password);
    }

    @Then("the user should be directed to the inventory page")
    public void inventoryPageIsOpened() {
        Assert.assertTrue(inventoryPage.isInventoryPageOpen(), "the current URL doesn't contain 'inventory'");
        Assert.assertTrue(inventoryPage.isProductsHeaderVisible(), "the products header isn't visible");
    }

    @Then("an error message should appear and contain {string}")
    public void checkErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(errorMessage));
    }

}
