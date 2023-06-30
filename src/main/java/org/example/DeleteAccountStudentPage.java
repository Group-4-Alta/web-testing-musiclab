package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountStudentPage {
    public static WebDriver driver;

    public DeleteAccountStudentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYaHapus;
    @FindBy(xpath = "//p[@class='text-md text-red-500 font-poppins cursor-pointer']")
    private WebElement btnDeleteAccStudent;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement btnLogin;
    public void clickBtnDeleteAccStudent(){
        btnDeleteAccStudent.click();
    }
    public boolean BackToLoginPage(){
        return btnLogin.isDisplayed();
    }
    public void clickBtnYaHapus(){
        btnYaHapus.click();
    }
}
