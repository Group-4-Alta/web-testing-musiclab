package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.LihatJadwalFMPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LihatJadwalFMSteps {

    private WebDriver webDriver;

    public LihatJadwalFMSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @And("User click the find mentor on homepage")
    public void clickFindMentor () {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickFindmentor();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to search mentor page")
    public void verifyLandingSearchMentor () {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        Assert.assertTrue(lihatJadwalFMPage.verifyLandingSearchMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click Nagita mentor")
    public void clickMentoronSearchPage () {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickMentorNagita();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User will direct to profile detail mentor page")
    public void verifyLandingMentorDetailPage () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(lihatJadwalFMPage.verifyLandingMentorDetail());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Lihat Jadwal Dropdown")
    public void clickJadwalMarker () {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickJadwalMarker();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}