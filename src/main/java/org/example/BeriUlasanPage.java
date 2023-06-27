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
    private WebElement inputDeskripsi;
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

    public int clickRating (int rating) {
        if (rating == 1) {
            return btnRating1.click();
        } if (rating == 2) {
            return btnRating2.click();
        } if (rating == 3) {
            return btnRating3.click();
        } if (rating == 4) {
            return btnRating4.click();
        } else return btnRating5.click();
    }
}
