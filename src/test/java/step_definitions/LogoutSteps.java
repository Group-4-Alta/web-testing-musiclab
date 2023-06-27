package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.example.LogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LogoutSteps {

    private WebDriver webDriver;

    public LogoutSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }
    @And("User click the logout menu on homepage")
    public void clickLogoutBtn() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickLogout();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("^User will direct to login page$")
    public void verifyLandingLoginPage() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyLandingLoginPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
