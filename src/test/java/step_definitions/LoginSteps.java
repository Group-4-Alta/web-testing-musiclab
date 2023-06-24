package step_definitions;

import cucumber.api.java.en.And;
import org.example.LoginPage;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
        Thread.sleep(2000);
        registerPage.setPassword(password);
        Thread.sleep(2000);
        registerPage.setSelectRole(selRole);
        Thread.sleep(2000);
    }
    @And("User click the login button")
    public void clickLoginBtn() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnLogin();
        Thread.sleep(2000);
    }
    @And("User will direct to homepage")
    public void verifyLandingHomepage() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingHomepage());
        Thread.sleep(3000);
    }
}
