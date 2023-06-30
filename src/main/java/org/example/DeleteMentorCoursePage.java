package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteMentorCoursePage {
    public static WebDriver driver;

    public DeleteMentorCoursePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-kursussaya']")
    private WebElement btnKursusSaya;
    @FindBy(xpath = "//div[@class='grid grid-flow-row auto-rows-max grid-cols-2 gap-8 md:grid-cols-4 lg:grid-cols-4']/div[3]//button[@id='btn-hapus']")
    private WebElement btnDeleteCourse;
    @FindBy(xpath = "//button[@id='btn-uploadnewcourse']")
    private WebElement btnUploadNewCourse;
    @FindBy(xpath = "//button[@id='btn-back']")
    private WebElement btnBackKursusSaya;
    public void clickBtnKursusSaya(){
        btnKursusSaya.click();
    }
    public boolean verifyLandingKursusSayaPage(){
        return btnUploadNewCourse.isDisplayed();
    }
    public void clickBtnDeleteCourse(){
        btnDeleteCourse.click();
    }
    public boolean BackToKursusSayaPage(){
        return btnUploadNewCourse.isDisplayed();
    }
    public void clickBtnBackKursusSaya(){
        btnBackKursusSaya.click();
    }
}
