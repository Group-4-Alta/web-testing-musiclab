package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalSayaMentorPage {
    public static WebDriver driver;

    public JadwalSayaMentorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-jadwalsaya']")
    private WebElement btnJadwalSayaMentor;
    @FindBy(xpath = "//h1[@class='text-button font-bold text-2xl']")
    private WebElement historyMengajar;
    @FindBy(xpath = "//button[@id='btn-kembali']")
    private WebElement kembaliButton;
    public void clickBtnJadwalSaya(){
        btnJadwalSayaMentor.click();
    }
    public boolean verifyLandingHistoryMengajarPage(){
        return historyMengajar.isDisplayed();
    }
    public String verifyMengajarPage(){
        return historyMengajar.getText();
    }
    public void clickBtnKembali(){
        kembaliButton.click();
    }
    public boolean backToProfileMentorPage(){
        return btnJadwalSayaMentor.isDisplayed();
    }
}
