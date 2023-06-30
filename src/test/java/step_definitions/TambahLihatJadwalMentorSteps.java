package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.example.TambahLiatJadwalMentorPage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TambahLihatJadwalMentorSteps {
    private WebDriver webDriver;

    public TambahLihatJadwalMentorSteps() {
            super();
            this.webDriver = Hooks.webDriver;
        }

    @And("User click the Tambah Jadwal option")
        public void userClickTheTambahJadwalOption () {
            TambahLiatJadwalMentorPage tambahLiatJadwalMentorPage = new TambahLiatJadwalMentorPage(webDriver);
            tambahLiatJadwalMentorPage.setTambahJadwal();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }


    @And("User select \"([^\"]*)\" as day, input \"([^\"]*)\" as start time, input \"([^\"]*)\" as end time")
    public void userInputAsStartTimeEndTime(String hari, int shour, int ehour) {
        TambahLiatJadwalMentorPage tambahLiatJadwalMentorPage = new TambahLiatJadwalMentorPage(webDriver);
        tambahLiatJadwalMentorPage.setPilihHari(hari);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        tambahLiatJadwalMentorPage.setStartHour(shour);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        tambahLiatJadwalMentorPage.setEndHour(ehour);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Upload Jadwal button at Tambah Jadwal option")
    public void userClickTheUploadJadwalButtonAtTambahJadwalOption() {
        TambahLiatJadwalMentorPage tambahLiatJadwalMentorPage = new TambahLiatJadwalMentorPage(webDriver);
        tambahLiatJadwalMentorPage.clickUploadJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Lihat Jadwal feature")
    public void userClickTheLihatJadwalFeature(){
        TambahLiatJadwalMentorPage tambahLiatJadwalMentorPage = new TambahLiatJadwalMentorPage(webDriver);
        tambahLiatJadwalMentorPage.clickLihatJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the X button to delete the Jadwal")
    public void userClickTheXButtonToDeleteTheJadwal() {
        TambahLiatJadwalMentorPage tambahLiatJadwalMentorPage = new TambahLiatJadwalMentorPage(webDriver);
        tambahLiatJadwalMentorPage.clickbtnX();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}