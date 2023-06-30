package step_definitions;

import cucumber.api.java.en.And;
import org.example.BuyingCoursePage;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

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
        String oriWindow = webDriver.getWindowHandle();
        assert webDriver.getWindowHandles().size() == 1;
        webDriver.findElement(By.xpath("//button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : webDriver.getWindowHandles()) {
            if(!oriWindow.contentEquals(windowHandle)) {
                webDriver.switchTo().window(windowHandle);
                break;
            }
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to payment method page in new tab")
    public void verifyPaymentMethodPage () {
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

    @And("User will get the pop up message title \"(.*)\"")
    public void verifyPopupTitle (String errorTitle) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        BuyingCoursePage buyingCoursePage = new BuyingCoursePage(webDriver);
        Assert.assertTrue(registerPage.verifyMessageBoxMustShow());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assert.assertEquals(errorTitle, buyingCoursePage.verifyMessageBoxTitle());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        registerPage.clickBtnOkPopupMessage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
