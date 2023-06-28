package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountMentorPage {
    public static WebDriver driver;

    public DeleteAccountMentorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-deactivateaccount']")
    private WebElement btnDeactiveMentor;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYaHapusAkun;

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled swal2-default-outline']")
    private WebElement btnBatal;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement backLoginPage;

    public void clickBtnDeactiveMentor(){
        btnDeactiveMentor.click();
    }

    public void clickBtnYaHapusAkun(){
        btnYaHapusAkun.click();
    }
    public void clickBtnBatal(){
        btnBatal.click();
    }

    public boolean verifyBackToLoginPage(){
        return backLoginPage.isDisplayed();
    }

}
