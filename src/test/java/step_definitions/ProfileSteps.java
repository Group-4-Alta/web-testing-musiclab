package step_definitions;

import cucumber.api.java.en.And;
import org.example.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProfileSteps {
    private WebDriver webDriver;
    public ProfileSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }
    @And("User click the profile menu on homepage")
    public void clickProfileMenuForStudent() throws InterruptedException{
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickProfileMenu();
        Thread.sleep(2000);
    }
    @And("User already in profile student page")
    public void verifyLandingProfileStudentPage() throws InterruptedException{
        ProfilePage profilePage = new ProfilePage(webDriver);
        Assert.assertTrue(profilePage.verifyLandingProfileStudentPage());
        Thread.sleep(3000);
    }
    @And("User already in profile mentor page")
    public void verifyLandingProfileMentorPage() throws InterruptedException{
        ProfilePage profilePage = new ProfilePage(webDriver);
        Assert.assertTrue(profilePage.verifyLandingProfileMentorPage());
        Thread.sleep(3000);
    }
}
