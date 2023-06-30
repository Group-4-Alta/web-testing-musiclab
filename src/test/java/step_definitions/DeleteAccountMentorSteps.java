package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.De;
import org.example.DeleteAccountMentorPage;
import org.example.DeleteMentorCoursePage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DeleteAccountMentorSteps {
    private WebDriver webDriver;

    public DeleteAccountMentorSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

        @When("User click Deactive Account button")
        public void userClickDeactiveAccountButton() {
            DeleteAccountMentorPage deleteAccountMentorPage = new DeleteAccountMentorPage(webDriver);
            deleteAccountMentorPage.clickBtnDeactiveMentor();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
}

