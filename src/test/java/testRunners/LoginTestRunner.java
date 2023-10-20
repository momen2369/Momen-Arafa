package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/login.feature"},
        glue = {"stepDefinitions"},
        plugin = {"testng", "html:target/cucumber-html-report.html","json:target/cucumber.json"}
)
public class LoginTestRunner {
}
