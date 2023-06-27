package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.DetailCourseMentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DetailCourseMentorSteps {
    private WebDriver webDriver;

    public DetailCourseMentorSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User click the course at kursus saya page")
    public void clickCourseMentor1(){
        DetailCourseMentorPage detailCourseMentorPage = new DetailCourseMentorPage(webDriver);
        detailCourseMentorPage.clickCourseMentor1();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will direct to the detail course page")
    public void verifyLandingDetailCoursePage(){
        DetailCourseMentorPage detailCourseMentorPage = new DetailCourseMentorPage(webDriver);
        Assert.assertTrue(detailCourseMentorPage.verifyLandingDetailCoursePage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("User click the course at profile mentor page")
    public void clickCourseMentor2(){
        DetailCourseMentorPage detailCourseMentorPage = new DetailCourseMentorPage(webDriver);
        detailCourseMentorPage.clickCourseMentor2();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
