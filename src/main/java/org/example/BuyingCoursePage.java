package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuyingCoursePage {

    public static WebDriver driver;

    public BuyingCoursePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//div[5]/div[@class='flex-1']")
    private WebElement bujicobamentor;
    @FindBy (xpath = "//img[@alt='Album']")
    private WebElement pianocoursebuji;
    @FindBy (xpath = "//h1[@class='text-black font-bold w-9/12 flex justify-start text-2xl font-poppins lg:mt-0 -mt-8']")
    private WebElement detailcoursepage;
    @FindBy (xpath = "//button[@id='btn-belikursus']")
    private WebElement btnbelikursus;
    @FindBy (xpath = "//div[@class='flex flex-col w-10/12 min-h-screen p-7 mt-8 space-y-2']/div[3]/p[.='Rp. 4500000']")
    private WebElement paymentpage;
    @FindBy (xpath = "//input[@id='input-start_date']")
    private WebElement inputdate;
    @FindBy (xpath = "//select[@id='select-role']")
    private WebElement pilihhari;
    @FindBy (xpath = "//button[@class='btn bg-[#3A2BE8] mt-4']")
    private WebElement btnavailability;
//    @FindBy (xpath = "//button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']")
//    private WebElement btncontinuepayment;
    @FindBy (xpath = "//div[@class='merchant-name']")
    private WebElement paymentmethondpage;
    @FindBy (xpath = "//img[@alt='BCA']")
    private WebElement bcavirtual;
    @FindBy (xpath = "//a[@href='#/bank-transfer/bca-va']/div[@class='payment-page-text']")
    private WebElement bcainvirtual;
    @FindBy (xpath = "//div[@id='vaField']")
    private WebElement virtualaccountnumber;
    @FindBy (xpath = "//button[@class='btn full primary  btn-theme']")
    private WebElement btnbackmerchant;
    @FindBy (xpath = "//div[@class='text-headline medium']")
    private WebElement transactionprocessed;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popuptitle;

    public void clickMentorBuji () {
        bujicobamentor.click();
    }

    public void clickPianoCourse () {
        pianocoursebuji.click();
    }

    public boolean verifyLandingDetailCoursePage () {
        return detailcoursepage.isDisplayed();
    }

    public void clickBeliKursus () {
        btnbelikursus.click();
    }

    public boolean verifyLandingPaymentPage () {
        return paymentpage.isDisplayed();
    }

    public void setInputdate (String date) {
        inputdate.sendKeys(date);
    }

    public void selectpilihhari (String day) {
        Select hari = new Select(pilihhari);
        pilihhari.click();
        hari.selectByVisibleText(day);
    }

    public void checkavailability () {
        btnavailability.click();
    }

//    public void clickcontinuepayment () {
//        btncontinuepayment.click();
//    }

    public boolean verifypaymentmethondpage () {
        return paymentmethondpage.isDisplayed();
    }

    public void clickbcavirtual () {
        bcavirtual.click();
    }

    public void clickbcainvirtual () {
        bcainvirtual.click();
    }

    public boolean verifyvirtualaccountnumber () {
        return virtualaccountnumber.isDisplayed();
    }

    public void clickbtnmerchant () {
        btnbackmerchant.click();
    }

    public boolean verifytransactionprocessed () {
        return transactionprocessed.isDisplayed();
    }

    public boolean verifyBtnBeliKursus () {
        driver.get("https://music-lab-immersive.netlify.app/detailCourse/12");
        if (driver.getPageSource().contains("Beli Kursus")) {
            return true;
        } else return false;
    }

    public String verifyMessageBoxTitle(){
        return popuptitle.getText();
    }
}
