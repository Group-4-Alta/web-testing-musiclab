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

    public void clickBtnDeactiveMentor(){
        btnDeactiveMentor.click();
    }

}
