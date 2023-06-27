package step_definitions;

import cucumber.api.java.en.And;
import org.example.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProfileSteps {
    private WebDriver webDriver;
    public ProfileSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }
    @And("User click the profile menu on homepage")
    public void clickProfileMenuForStudent(){
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickProfileMenu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User already in profile student page")
    public void verifyLandingProfileStudentPage(){
        ProfilePage profilePage = new ProfilePage(webDriver);
        webDriver.navigate().refresh();
        Assert.assertTrue(profilePage.verifyLandingProfileStudentPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User already in profile mentor page")
    public void verifyLandingProfileMentorPage(){
        ProfilePage profilePage = new ProfilePage(webDriver);
        webDriver.navigate().refresh();
        Assert.assertTrue(profilePage.verifyLandingProfileMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
