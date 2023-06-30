package step_definitions;

import org.example.DeleteMentorCoursePage;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.time.Duration;

public class DeleteMentorCourseSteps {
    private WebDriver webDriver;

    public DeleteMentorCourseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click the kursus saya button at profile mentor page")
    public void clickKursusSayaBtn(){
        DeleteMentorCoursePage deleteMentorCoursePage = new DeleteMentorCoursePage(webDriver);
        deleteMentorCoursePage.clickBtnKursusSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User already in daftar kursus saya page")
    public void verifyLandingKursusSayaPage(){
        DeleteMentorCoursePage deleteMentorCoursePage = new DeleteMentorCoursePage(webDriver);
        Assert.assertTrue(deleteMentorCoursePage.verifyLandingKursusSayaPage());
        webDriver.navigate().refresh();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("User click the delete button at course")
    public void clickDeleteCourseBtn(){
        DeleteMentorCoursePage deleteMentorCoursePage = new DeleteMentorCoursePage(webDriver);
        deleteMentorCoursePage.clickBtnDeleteCourse();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will direct back to kursus saya page")
    public void directBackToKursusSayaPage(){
        DeleteMentorCoursePage deleteMentorCoursePage = new DeleteMentorCoursePage(webDriver);
        Assert.assertTrue(deleteMentorCoursePage.BackToKursusSayaPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("User click the kembali button at kursus saya page")
    public void clickKembaliBtnKursusSayaPage(){
        DeleteMentorCoursePage deleteMentorCoursePage = new DeleteMentorCoursePage(webDriver);
        deleteMentorCoursePage.clickBtnBackKursusSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
