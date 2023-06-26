package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public static WebDriver driver;

    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[.='Profile']")
    private WebElement btnProfileMenu;
    @FindBy(xpath = "//button[@class='btn border-none rounded-xl w-5/6 lg:w-3/6 bg-[#3A2BE8] text-white font-semibold mt-5']")
    private WebElement btnJadwalStudent;
    @FindBy(xpath = "//button[@id='btn-kursussaya']")
    private WebElement btnKursusSaya;
    public void clickProfileMenu(){
        btnProfileMenu.click();
    }
    public boolean verifyLandingProfileStudentPage(){
        return btnJadwalStudent.isDisplayed();
    }
    public boolean verifyLandingProfileMentorPage(){
        return btnKursusSaya.isDisplayed();
    }
}
