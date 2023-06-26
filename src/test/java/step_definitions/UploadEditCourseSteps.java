package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.RegisterPage;
import org.example.UploadEditCoursePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UploadEditCourseSteps {
    private WebDriver webDriver;
    public UploadEditCourseSteps(){
        super();
        this.webDriver=Hooks.webDriver;
    }


    @And("User click Kursus Saya menu on profile page")
    public void userClickKursusSayaMenuOnProfilePage() throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickKursusSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to Course page")
    public void userWillDirectToCoursePage() throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        webDriver.navigate().refresh();
        Assert.assertTrue(uploadEditCoursePage.coursePage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Upload New Course menu on Course page")
    public void userClickTheUploadNewCourseMenuOnCoursePage()  throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickUploadKNewCourse();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to Upload Kursus page")
    public void userWillDirectToUploadKursusPage()  throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        webDriver.navigate().refresh();
        Assert.assertTrue(uploadEditCoursePage.verifyUploadKursusPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Choose File button to edit profile picture")
    public void userClickTheChooseFileButtonToEditProfilePicture() throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.uploadPhotoProfile();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @And("User input \"([^\"]*)\" as Judul Kursus, select \"([^\"]*)\" on Tingkatan Khusus/Level field, \"([^\"]*)\" as Deskripsi Khusus, \"([^\"]*)\" as Apa yang akan dipelajari, \"([^\"]*)\" as Prasyarat Khusus, \"([^\"]*)\" as Untuk siapa khursus ini, \"([^\"]*)\" as Harga khusus, \"([^\"]*)\" as duration")
    public void userInput(String judul, String level, String deskripsi, String dipelajari, String prasyarat, String untukSiapa, int harga, int duration) throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.setJudulKhursusField(judul);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setSelectRoleLevel(level);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setDeskripsiKhususField(deskripsi);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setApaYangDipelajariField(dipelajari);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setPrasyaratKhususField(prasyarat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setUntukSiapaKhursusIniField(untukSiapa);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setHargaKhususField(harga);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        uploadEditCoursePage.setDurationField(duration);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click Upload Kursus button")
    public void userClickUploadKursusButton() throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickBtnUploadKursus();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click Cancel on Upload Kursus Page")
    public void userClickCancelOnUploadKursusPage() throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickBtnCancel();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click edit button for Piano - Advance Class on course list")
    public void userClickEditButtonForPianoAdvanceClassOnCourseList()throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickBtnEditCourse();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User edit the \"([^\"]*)\" as Harga Khusus field")
    public void userEditTheAsHargaKhususField(int harga) throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.setHargaKhususField(harga);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click Update Kursus button")
    public void userClickUpdateKursusButton() throws InterruptedException{
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.clickBtnUpdateKursus();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @And("User edit the Harga Khusus field to empty field")
    public void userEditTheHargaKhususFieldToEmptyField()throws InterruptedException {
        UploadEditCoursePage uploadEditCoursePage = new UploadEditCoursePage(webDriver);
        uploadEditCoursePage.setEmptyHargaKhususField();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
