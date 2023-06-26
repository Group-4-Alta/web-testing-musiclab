package step_definitions;

import cucumber.api.java.en.And;
import org.example.LoginPage;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }
    @And("User input \"(.*)\" as email, input \"(.*)\" as password and select \"(.*)\" as role")
    public void loginAccount(String emailLogin, String password, String selRole) throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmailLogin(emailLogin);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.setPassword(password);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.setSelectRole(selRole);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User click the login button")
    public void clickLoginBtn() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnLogin();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User will direct to homepage")
    public void verifyLandingHomepage() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingHomepage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

}
