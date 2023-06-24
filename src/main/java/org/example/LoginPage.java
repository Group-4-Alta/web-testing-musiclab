package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement btnLogin;
    @FindBy(xpath = "//button[@id='btn-findmentor']")
    private WebElement btnFindMentor;
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement emailLogin;
    public void setEmailLogin(String emailLog){
        emailLogin.sendKeys(emailLog);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    public boolean verifyLandingHomepage(){
        return btnFindMentor.isDisplayed();
    }
}
