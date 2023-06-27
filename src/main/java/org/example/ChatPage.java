package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
    public static WebDriver driver;

    public ChatPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//label[@class='btn bg-[#3A2BE8] text-white mt-2 px-16 border-none']")
    private WebElement btnLihatChat;

    @FindBy (xpath = "//input[@id='send']")
    private WebElement chatFieldStudent;

    @FindBy (xpath = "//button[@class='btn w-28 rounded-xl text-white']")
    private WebElement btnSendStudent;

    @FindBy (xpath = "//label[@class='btn']")
    private WebElement btnCloseStudent;

    @FindBy (xpath = "//span[.='nagita123@gmail.com']")
    private WebElement nagitaPage;

    @FindBy(xpath = "//a[.='Chat']")
    private WebElement btnChatMentor;

    @FindBy (xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']/div[@class='card-body']")
    private WebElement chatListPage;

    @FindBy (xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']//div[2]//label[@class='btn font-semibold']")
    private WebElement btnSeeMessage;

    @FindBy (xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']/div[@class='card-body']/div[2]//input[@id='send']")
    private WebElement chatFieldMentor;

    @FindBy (xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']/div[@class='card-body']/div[2]//button[@class='btn w-28 rounded-xl text-white']")
    private WebElement btnSendMentor;


    public void clickButtonLihatChat(){
        btnLihatChat.click();
    }

    public void studentAddMessage(String message){
        chatFieldStudent.sendKeys(message);
    }

    public void clickBtnSendStudent(){
        btnSendStudent.click();
    }

    public void clickBtnCloseStudent(){
        btnCloseStudent.click();
    }

    public boolean landingMentorPage(){
        return nagitaPage.isDisplayed();
    }
    public void clickBtnChat(){
        btnChatMentor.click();
    }
     public boolean showChatListPage(){
        return chatListPage.isDisplayed();
     }

     public void seeMessage(){
        btnSeeMessage.click();
     }

     public void mentorAddMessage(String message){
         chatFieldMentor.sendKeys(message);
     }

     public void btnSendMessageMentor(){
        btnSendMentor.click();
     }


}

