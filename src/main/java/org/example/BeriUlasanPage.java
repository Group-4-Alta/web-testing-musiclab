package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeriUlasanPage {

    public static WebDriver driver;

    public BeriUlasanPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//tr[2]//button[@id='btn-linkulasan']")
    private WebElement btnBeriUlasan;
    @FindBy (xpath = "//button[@id='btn-submitulasan']")
    private WebElement btnSubmitUlasan;
    @FindBy (xpath = "//textarea[@id='input-deskripsi']")
    private WebElement commentField;
    @FindBy (xpath = "//button[1]/span[@class='star text-6xl']")
    private WebElement btnRating1;
    @FindBy (xpath = "//button[2]/span[@class='star text-6xl']")
    private WebElement btnRating2;
    @FindBy (xpath = "//button[3]/span[@class='star text-6xl']")
    private WebElement btnRating3;
    @FindBy (xpath = "//button[4]/span[@class='star text-6xl']")
    private WebElement btnRating4;
    @FindBy (xpath = "//button[5]/span[@class='star text-6xl']")
    private WebElement btnRating5;

    public void clickBtnBeriUlasan () {
        btnBeriUlasan.click();
    }

    public boolean verifyUlasanPage () {
        return btnSubmitUlasan.isDisplayed();
    }

    public void inputCommentField (String comment) {
        commentField.sendKeys(comment);
    }

    public void clickRating1 () {
        btnRating1.click();
    }

    public void clickRating2 () {
        btnRating2.click();
    }

    public void clickRating3 () {
        btnRating3.click();
    }

    public void clickRating4 () {
        btnRating4.click();
    }

    public void clickRating5 () {
        btnRating5.click();
    }

    public void clickSubmitUlasan () {
        btnSubmitUlasan.click();
    }

    public boolean verifyBtnBeriUlasan () {
        return btnBeriUlasan.isEnabled();
    }
}
