package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.JadwalStudentPage;
import org.example.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class JadwalStudentSteps {
    private WebDriver webDriver;

    public JadwalStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click the jadwal button at profile student page")
    public void clickJadwalBtnStudent(){
        JadwalStudentPage jadwalStudentPage = new JadwalStudentPage(webDriver);
        jadwalStudentPage.clickBtnJadwalStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User already in Histori Belajar page")
    public void verifyLandingHistoryBelajarPage(){
        JadwalStudentPage jadwalStudentPage = new JadwalStudentPage(webDriver);
        Assert.assertTrue(jadwalStudentPage.verifyLandingHistoryBelajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String page = "Histori Belajar";
        Assert.assertEquals(page, jadwalStudentPage.verifyBelajarPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User click the kembali button at history belajar page")
    public void clickKembaliButtonJadwalStu(){
        JadwalStudentPage jadwalStudentPage = new JadwalStudentPage(webDriver);
        jadwalStudentPage.clickBtnKembali();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}


