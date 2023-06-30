package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalStudentPage {
    public static WebDriver driver;

    public JadwalStudentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='btn border-none rounded-xl w-5/6 lg:w-3/6 bg-[#3A2BE8] text-white font-semibold mt-5']")
    private WebElement btnJadwalStudent;
    @FindBy(xpath = "//h1[@class='text-button font-bold text-2xl']")
    private WebElement historiBelajar;
    @FindBy(xpath = "//button[@id='btn-kembali']")
    private WebElement kembaliButton;
    public void clickBtnJadwalStu(){
        btnJadwalStudent.click();
    }
    public boolean verifyLandingHistoryBelajarPage(){
        return historiBelajar.isDisplayed();
    }
    public String verifyBelajarPage(){
        return historiBelajar.getText();
    }
    public void clickBtnKembali(){
        kembaliButton.click();
    }
}
