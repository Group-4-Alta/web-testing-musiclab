package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.BeriUlasanPage;
import org.example.JadwalStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BeriUlasanSteps {

    private WebDriver webDriver;

    public BeriUlasanSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the beri ulasan button")
    public void clickBtnBeriUlasan () {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        beriUlasanPage.clickBtnBeriUlasan();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to ulasan page")
    public void verifyLandingUlasanPage () {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        Assert.assertTrue(beriUlasanPage.verifyUlasanPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"(.*)\" as comment and click \"(.*)\" star on rating")
    public void givingFeedback (String comment, int rating) {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        beriUlasanPage.inputCommentField(comment);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if (rating == 1) {
            beriUlasanPage.clickRating1();
        } if (rating == 2) {
            beriUlasanPage.clickRating2();
        } if (rating == 3) {
            beriUlasanPage.clickRating3();
        } if (rating == 4) {
            beriUlasanPage.clickRating4();
        } else beriUlasanPage.clickRating5();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the submit ulasan button")
    public void clickSubmitUlasan () {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        beriUlasanPage.clickSubmitUlasan();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User will direct back to history belajar page")
    public void verifyStayHistoryBelajarPage (){
        JadwalStudentPage jadwalStudentPage = new JadwalStudentPage(webDriver);
        Assert.assertTrue(jadwalStudentPage.verifyLandingHistoryBelajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String page = "Histori Belajar";
        Assert.assertEquals(page, jadwalStudentPage.verifyBelajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("beri ulasan button should be disabled")
    public void verifyBtnBeriUlasan () {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        Assert.assertFalse(beriUlasanPage.verifyBtnBeriUlasan());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will stay on ulasan page")
    public void verifyStayUlasanPage () {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        Assert.assertTrue(beriUlasanPage.verifyUlasanPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"(.*)\" as comment")
    public void inputBlankComment (String comment) {
        BeriUlasanPage beriUlasanPage = new BeriUlasanPage(webDriver);
        beriUlasanPage.inputCommentField(comment);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
