package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LihatJadwalFMPage {

    public static WebDriver driver;

    public LihatJadwalFMPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//button[@id='btn-findmentor']")
    private WebElement btnfindmentor;
    @FindBy (xpath = "//input[@id='search']")
    private WebElement searchmentor;
    @FindBy (xpath = "//div[@class='m-5 grid grid-cols-2 gap-3']/div[3]//img[@src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    private WebElement johannesmentor;
    @FindBy (xpath = "//p[@class='text-5xl font-bold']")
    private WebElement mentortitle;
    @FindBy (xpath = "//summary[.='Lihat Jadwal']")
    private WebElement jadwalmarker;

    public void clickFindmentor () {
        btnfindmentor.click();
    }

    public boolean verifyLandingSearchMentorPage () {
        return searchmentor.isDisplayed();
    }

    public void clickMentorJohannes () {
        johannesmentor.click();
    }

    public boolean verifyLandingMentorDetail () {
        return mentortitle.isDisplayed();
    }

    public void clickJadwalMarker () {
        jadwalmarker.click();
    }
}