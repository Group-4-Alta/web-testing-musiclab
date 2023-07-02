package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailCourseMentorPage {
    public static WebDriver driver;

    public DetailCourseMentorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//img[@src='https://bucket-musiclab.s3.ap-northeast-1.amazonaws.com/fCDnpsX12B4z5Mh6vA3GB.jpg']")
    private WebElement courseMentor1;
    @FindBy(xpath = "//h1[@class='text-black text-2xl font-bold font-poppins']")
    private WebElement deskripsiKhusus;
    @FindBy(xpath = "//img[@src='https://bucket-musiclab.s3.ap-northeast-1.amazonaws.com/fCDnpsX12B4z5Mh6vA3GB.jpg']")
    private WebElement courseMentor2;
    public void clickCourseMentor1(){
        courseMentor1.click();
    }
    public boolean verifyLandingDetailCoursePage(){
        return deskripsiKhusus.isDisplayed();
    }
    public void clickCourseMentor2(){
        courseMentor2.click();
    }
}
