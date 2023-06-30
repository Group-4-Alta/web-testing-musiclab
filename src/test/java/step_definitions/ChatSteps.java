package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.example.ChatPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class ChatSteps {
    private WebDriver webDriver;

    public ChatSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And ("User click the Lihat Chat button")
    public void userClickTheLihatChatButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.clickButtonLihatChat();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @And("User input \"([^\"]*)\" as message for mentor")
    public void userInputAsMessage(String message){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.studentAddMessage(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the SEND button for send the message to mentor")
    public void userClickTheSENDButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.clickBtnSendStudent();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the CLOSE button")
    public void userClickTheCLOSEButton(){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.clickBtnCloseStudent();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User already on mentor profile page")
    public void userAlreadyOnMentorProfilePage(){
        ChatPage chatPage = new ChatPage(webDriver);
        Assert.assertTrue(chatPage.landingMentorPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the Chat menu on profile mentor page")
    public void userClickTheChatMenuOnProfileMentorPage(){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.clickBtnChat();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User will direct to Chat list page")
    public void userWillDirectToChatListPage(){
        ChatPage chatPage = new ChatPage(webDriver);
        Assert.assertTrue(chatPage.showChatListPage());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the See Message button from Bagas")
    public void userClickTheSeeMessageButtonFromBagas(){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.seeMessage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User input \"([^\"]*)\" as message for student")
    public void userInputAsMessageForStudent(String message){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.mentorAddMessage(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User click the SEND button for send the message to student")
    public void userClickTheSENDButtonForSendTheMessageToStudent() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.btnSendMessageMentor();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

}