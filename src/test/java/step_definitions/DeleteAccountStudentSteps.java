package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.DeleteAccountStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DeleteAccountStudentSteps {
    private WebDriver webDriver;

    public DeleteAccountStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User click the delete account button")
    public void clickDeleteAccStudentBtn(){
        DeleteAccountStudentPage deleteAccountStudentPage = new DeleteAccountStudentPage(webDriver);
        deleteAccountStudentPage.clickBtnDeleteAccStudent();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @And("User click the Ya, Hapus Akun button")
    public void clickYaHapusAkunBtn() {
        DeleteAccountStudentPage deleteAccountStudentPage = new DeleteAccountStudentPage(webDriver);
        deleteAccountStudentPage.clickBtnYaHapus();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Then("User will direct back to login page")
    public void directBackToLoginPage() throws InterruptedException{
        DeleteAccountStudentPage deleteAccountStudentPage = new DeleteAccountStudentPage(webDriver);
        Assert.assertTrue(deleteAccountStudentPage.BackToLoginPage());
        Thread.sleep(3000);
    }
}
