package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    public static WebDriver driver;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Login']")
    private WebElement btnLoginMenu;
    @FindBy(xpath = "//a[.='Register']")
    private WebElement registerOption;
    @FindBy(xpath = "//input[@id='input-namalengkap']")
    private WebElement namaLengkap;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectRole;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailRegister;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//i[@class='fa fa-eye']")
    private WebElement showPassword;
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement emailLogin;
    @FindBy(xpath = "//button[@id='btn-register']")
    private WebElement btnRegister;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnOkPopupMessage;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpMessage;

    public boolean verifyLandingWebPage(){
        return btnLoginMenu.isDisplayed();
    }
    public void clickLoginMenu(){
        btnLoginMenu.click();
    }
    public boolean verifyLandingLoginPage(){
        return emailLogin.isDisplayed();
    }
    public void clickRegisterOption(){
        registerOption.click();
    }
    public boolean verifyLandingRegisterPage(){
        return namaLengkap.isDisplayed();
    }
    public void setNamaLengkap(String nama){
        namaLengkap.sendKeys(nama);
    }
    public void setSelectRole(String role){
        Select a = new Select(selectRole);
        selectRole.click();
        a.selectByVisibleText(role);
    }
    public void setEmailRegister(String emailReg){
        emailRegister.sendKeys(emailReg);
    }
    public void setPassword(String psd){
        password.sendKeys(psd);
        showPassword.click();
    }
    public void clickBtnRegister(){
        btnRegister.click();
    }
    public void clickBtnOkPopupMessage(){
        btnOkPopupMessage.click();
    }
    public boolean verifyMessageBoxMustShow(){
        return popUpMessage.isDisplayed();
    }
    public String verifyMessageBox(){
        return popUpMessage.getText();
    }
}
