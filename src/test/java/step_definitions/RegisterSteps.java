package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    private WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @Given("User already on musiclab website")
    public void verifyLandingPage() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingWebPage());
        Thread.sleep(3000);
    }
    @When("User click login menu on musiclab website")
    public void clickBtnLoginMenu() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickLoginMenu();
        Thread.sleep(2000);
    }
    @Then("User already in login page")
    public void verifyLandingLoginPage() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingLoginPage());
        Thread.sleep(3000);
    }
    @And("User click register option on login page")
    public void clickRegisterOptions() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterOption();
        Thread.sleep(2000);
    }
    @And("User already in register page")
    public void verifyLandingRegisterPage() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingRegisterPage());
        Thread.sleep(3000);
    }
    @And("User input \"(.*)\" as namaLengkap, select \"(.*)\" as role, input \"(.*)\" as email and input \"(.*)\" as password")
    public void registerAccount(String namaLengkap, String selRole, String emailRegist, String password) throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setNamaLengkap(namaLengkap);
        Thread.sleep(2000);
        registerPage.setSelectRole(selRole);
        Thread.sleep(2000);
        registerPage.setEmailRegister(emailRegist);
        Thread.sleep(2000);
        registerPage.setPassword(password);
        Thread.sleep(2000);
    }
    @Then("User will get the pop up message \"(.*)\"")
    public void verifyPopupMessage(String errorLetters) throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyMessageBoxMustShow());
        Thread.sleep(2000);
        Assert.assertEquals(errorLetters, registerPage.verifyMessageBox());
        Thread.sleep(2000);
        registerPage.clickBtnOkPopupMessage();
        Thread.sleep(2000);
    }
    @And("User click the register button")
    public void clickRegisterBtn() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickBtnRegister();
        Thread.sleep(2000);
    }
    @And("User will see error")
    public void SeeError() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickBtnRegister();
        Thread.sleep(2000);
    }
}
