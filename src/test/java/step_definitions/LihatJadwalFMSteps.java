package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.LihatJadwalFMPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LihatJadwalFMSteps {

    private WebDriver webDriver;

    public LihatJadwalFMSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @And("User click the find mentor on homepage")
    public void clickFindMentor () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickFindmentor();
        Thread.sleep(2000);
    }

    @And("User will direct to search mentor page")
    public void verifyLandingSearchMentor () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        Assert.assertTrue(lihatJadwalFMPage.verifyLandingSearchMentorPage());
        Thread.sleep(2000);
    }

    @And("User click Nagita mentor")
    public void clickMentoronSearchPage () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickMentorNagita();
        Thread.sleep(2000);
    }

    @Then("User will direct to profile detail mentor page")
    public void verifyLandingMentorDetailPage () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        Assert.assertTrue(lihatJadwalFMPage.verifyLandingMentorDetail());
        Thread.sleep(2000);
    }

    @And("User click the Lihat Jadwal Dropdown")
    public void clickJadwalMarker () throws InterruptedException {
        LihatJadwalFMPage lihatJadwalFMPage = new LihatJadwalFMPage(webDriver);
        lihatJadwalFMPage.clickJadwalMarker();
        Thread.sleep(2000);
    }
}