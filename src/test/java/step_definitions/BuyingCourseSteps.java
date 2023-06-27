package step_definitions;

import cucumber.api.java.en.And;
import org.example.BuyingCoursePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;

public class BuyingCourseSteps {

    private WebDriver webDriver;

    public BuyingCourseSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @And("User click Buji Coba Aja mentor")
    public void clickMentoronSearchPage () throws InterruptedException {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickMentorBuji();
        Thread.sleep(3000);
    }

    @And("User click the Piano - Advance Class course")
    public void clickPianoAdvanceCourse () throws InterruptedException {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickPianoCourse();
        Thread.sleep(3000);
    }

    @And("User will direct to detail course page")
    public void verifyDetailCoursePage () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(buyingCoursePage.verifyLandingDetailCoursePage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Beli Kursus button")
    public void clickBeliKursus () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickBeliKursus();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to payment page")
    public void verifyPaymentPage () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(buyingCoursePage.verifyLandingPaymentPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"(.*)\" and select \"(.*)\" on check availability section")
    public void inputDateCourse (String tanggal, String hari) {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.setInputdate(tanggal);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        buyingCoursePage.selectpilihhari(hari);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the check availability button")
    public void clickAvailabilityBtn () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.checkavailability();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the continue payment button")
    public void clickContinuePayment () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickcontinuepayment();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to payment method page in new tab")
    public void verifyPaymentMethodPage () {
        ArrayList<String> wid = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(wid.get(1));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(buyingCoursePage.verifypaymentmethondpage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will select BCA Virtual Account as payment method")
    public void clickBCAVirtual () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickbcavirtual();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        buyingCoursePage.clickbcainvirtual();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will get virtual account number")
    public void verifyVirtualAccountNumber () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.verifyvirtualaccountnumber();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the back to merchant button")
    public void clickBtnMerchant () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        buyingCoursePage.clickbtnmerchant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will get message Your transaction is being processed")
    public void verifyTransactionProcessed () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(buyingCoursePage.verifytransactionprocessed());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will stay on payment page")
    public void verifyStayPaymentPage () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(buyingCoursePage.verifyLandingPaymentPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("Beli Kursus button should not displayed")
    public void verifyBtnBeliKursus () {
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertFalse(buyingCoursePage.verifyBtnBeliKursus());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
