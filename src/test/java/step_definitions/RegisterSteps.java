package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegisterSteps {
    private WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @Given("User already on musiclab website")
    public void verifyLandingPage(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingWebPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @When("User click login menu on musiclab website")
    public void clickBtnLoginMenu(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickLoginMenu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User already in login page")
    public void verifyLandingLoginPage(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingLoginPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @And("User click register option on login page")
    public void clickRegisterOptions(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterOption();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User already in register page")
    public void verifyLandingRegisterPage(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyLandingRegisterPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @And("User input \"(.*)\" as namaLengkap, select \"(.*)\" as role, input \"(.*)\" as email and input \"(.*)\" as password")
    public void registerAccount(String namaLengkap, String selRole, String emailRegist, String password) throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setNamaLengkap(namaLengkap);
        Thread.sleep(3000);
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.setSelectRole(selRole);
        Thread.sleep(3000);
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.setEmailRegister(emailRegist);
        Thread.sleep(3000);
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.setPassword(password);
        Thread.sleep(3000);
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will get the pop up message \"(.*)\"")
    public void verifyPopupMessage(String errorLetters){
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyMessageBoxMustShow());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assert.assertEquals(errorLetters, registerPage.verifyMessageBox());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.clickBtnOkPopupMessage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User click the register button")
    public void clickRegisterBtn(){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickBtnRegister();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User will see error")
    public void SeeError() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickBtnRegister();
        Thread.sleep(3000);
    }
}
