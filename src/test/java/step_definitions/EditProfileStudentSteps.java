package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.EditProfileStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EditProfileStudentSteps {
    private WebDriver webDriver;

    public EditProfileStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the edit profile button at profile student page")
    public void clickEditProfileStudent() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickEditProfileStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @And("User already in edit profile student page")
    public void verifyLandingEditProfileStuPage(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.verifyLandingEditProfileStuPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @When("User edit photo profile")
    public void updatePhotoProfileStu(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.editPhotoProfileStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @And("User input \"([^\"]*)\" as nameStudent, select \"([^\"]*)\" as gender, input \"([^\"]*)\" as phone, input \"([^\"]*)\" as emailStudent and input \"([^\"]*)\" as address student")
    public void userEditProfileStudent(String nameStu, String jenisK, String noHp, String emailStu, String address){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setNameUpdate(nameStu);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setSelectJenisKelamin(jenisK);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setPhoneUpdate(noHp);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setEmailUpdate(emailStu);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setAddressUpdate(address);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @And("User click the update button at edit profile student page")
    public void clickUpdateBtnStu(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickBtnUpdateStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("User input \"(.*)\" as oldPassword, input \"(.*)\" as newPassword and input \"(.*)\" as confirmPassword")
    public void editPasswordStudent(String oldPass, String newPass, String confirmPass){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setOldPassUpdate(oldPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setNewPassUpdate(newPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        editProfileStudentPage.setConfirmPassUpdate(confirmPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @And("User click the update password button at edit profile student page")
    public void clickUpdatePasswordBtnStu(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickBtnUpdatePasswordStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("User click the kembali button at edit profile student page")
    public void clickKembaliBtn(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickBtnKembaliStu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will direct back to profile student page")
    public void directBackToProfileStuPage(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.backToProfileStudentPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
