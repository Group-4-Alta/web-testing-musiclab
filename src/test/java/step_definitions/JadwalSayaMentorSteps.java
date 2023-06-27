package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.JadwalSayaMentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class JadwalSayaMentorSteps {
    private WebDriver webDriver;

    public JadwalSayaMentorSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click the jadwal saya button at profile mentor page")
    public void clickJadwalSayaBtn(){
        JadwalSayaMentorPage jadwalSayaMentorPage = new JadwalSayaMentorPage(webDriver);
        jadwalSayaMentorPage.clickBtnJadwalSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User already in Histori Mengajar page")
    public void verifyLandingHistoryMengajarPage(){
        JadwalSayaMentorPage jadwalSayaMentorPage = new JadwalSayaMentorPage(webDriver);
        Assert.assertTrue(jadwalSayaMentorPage.verifyLandingHistoryMengajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String page = "Histori Mengajar";
        Assert.assertEquals(page, jadwalSayaMentorPage.verifyMengajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User click the kembali button at histori mengajar page")
    public void clickKembaliButtonJadwalMentor(){
        JadwalSayaMentorPage jadwalSayaMentorPage = new JadwalSayaMentorPage(webDriver);
        jadwalSayaMentorPage.clickBtnKembali();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will direct back to profile mentor page")
    public void directBackToProfileMentorPage(){
        JadwalSayaMentorPage jadwalSayaMentorPage = new JadwalSayaMentorPage(webDriver);
        Assert.assertTrue(jadwalSayaMentorPage.backToProfileMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
