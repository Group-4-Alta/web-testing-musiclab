package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.checkerframework.checker.fenum.qual.AwtAlphaCompositingRule;
import org.example.EditProfileMentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EditProfileMentorSteps {

    private WebDriver webDriver;

    public EditProfileMentorSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the edit profile button at profile mentor page")
    public void clickBtnEditProfile () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickBtnEditProfileMentor();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User already in edit profile mentor page")
    public void verifyLandingEditMentorPage () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        webDriver.navigate().refresh();
        Assert.assertTrue(editProfileMentorPage.verifyEditProfileMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will input \"(.*)\" as namaLengkap, input \"(.*)\" as deskripsi select \"(.*)\" as jenisKelamin, \"(.*)\" as noHp, input \"(.*)\" as email, input \"(.*)\" as instagram account link, and input \"(.*)\" as alamat")
    public void editProfileMentor (String nama, String deskripsi, String jeniskelamin, String nohp, String email, String instagram, String alamat) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setFieldNama(nama);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldDeskripsi(deskripsi);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setSelectJenisKelamin(jeniskelamin);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldNoHP(nohp);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldEmail(email);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldInstagram(instagram);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldAlamat(alamat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User click the update button at edit profile mentor page")
    public void clickBtnUpdate () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickBtnUpdate();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"(.*)\" as alamat")
    public void inputAlamat (String alamat) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setFieldAlamat(alamat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User clear all data")
    public void cleardata () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clearAllField();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will stay on edit profile mentor page")
    public void verifyStayEditMentorPage () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        Assert.assertTrue(editProfileMentorPage.verifyEditProfileMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User type \"(.*)\" as email")
    public void inputEmailInvalid (String emailInv) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setFieldEmail(emailInv);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User upload profile picture")
    public void editProfilePicture () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.uploadPPMentor();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User edit profile picture with invalid format")
    public void editProfilePictureInv () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.uploadPPMentorInvalid();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User select \"(.*)\" as Tipe Sertifikat, input \"(.*)\" as nama sertifikat, choose a file under 500kb")
    public void editSertifikatValid (String tipesertifikat, String namasertifikat) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setSelectTipeSertifikat(tipesertifikat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.setFieldNamaSertifikat(namasertifikat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.uploadSertifikatValid();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User click the upload sertifikat button at edit profile mentor page")
    public void clickUploadSertifikat () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.clickBtnUploadSertifikat();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User don't select Tipe Sertifikat, input \"(.*)\" as nama sertifikat, choose a file over 500kb")
    public void editSertifikatInvalid (String namasertifikat) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setFieldNamaSertifikat(namasertifikat);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        editProfileMentorPage.uploadSertifikatInvalid();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User select \"(.*)\" as instrument you want to teach")
    public void selectInstrument (String instrument) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setSelectInstrument(instrument);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User click the update instruments button at edit profile mentor page")
    public void clickUpdateInstrument () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickUpdateInstrument();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User select \"(.*)\" as Your Genre Music")
    public void selectGenre (String genre) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setSelectGenre(genre);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User click the update genres button at edit profile mentor page")
    public void clickUpdateGenre () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickUpdateGenre();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"(.*)\" as oldPassword, input \"(.*)\" as newPassword and input \"(.*)\" as confirmationPassword")
    public void inputPasswords (String oldpass, String newpass, String confirmpass) {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.setInputPass(oldpass, newpass, confirmpass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User click the update password button at edit profile mentor page")
    public void clickUpdatePass () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickUpdatePass();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @And("User click the kembali button at edit profile mentor page")
    public void clickBtnKembali () {
        EditProfileMentorPage editProfileMentorPage = new EditProfileMentorPage(webDriver);
        editProfileMentorPage.clickBtnKembali();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
