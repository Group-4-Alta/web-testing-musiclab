package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public static WebDriver driver;

    public LogoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal px-1 lg:flex hidden']//a[.='Logout']")
    private WebElement btnLogout;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement btnLogin;

    public void clickLogout() {
        btnLogout.click();
    }

    public boolean verifyLandingLoginPage() {
        return btnLogin.isDisplayed();
    }
}