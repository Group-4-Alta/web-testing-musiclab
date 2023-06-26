package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditProfileStudentPage {
    public static WebDriver driver;

    public EditProfileStudentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//p[@class='text-md text-black font-poppins cursor-pointer']")
    private WebElement btnEditProfileStu;
    @FindBy(xpath = "//input[@id='input-namalengkap']")
    private WebElement namaLengkapField;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectJenisKelamin;
    @FindBy(xpath = "//input[@id='input-telepon']")
    private WebElement noHpField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailField;
    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement addressField;
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement btnUpdate;
    @FindBy(xpath = "//button[@id='btn-back']")
    private WebElement btnKembali;
    @FindBy(xpath = "//input[@id='input-oldpassword']")
    private WebElement oldPasswordField;
    @FindBy(xpath = "//input[@id='input-newpasword']")
    private WebElement newPasswordField;
    @FindBy(xpath = "//input[@id='input-confirmpassword']")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//i[@class='fa fa-eye']")
    private WebElement showPassword;
    @FindBy(xpath = "//button[@id='btn-updatepassword']")
    private WebElement btnUpdatePassword;
    @FindBy(xpath = "//input[@id='input-file']")
    private WebElement btnChooseFile;
    @FindBy(xpath = "//button[@class='btn border-none rounded-xl w-5/6 lg:w-3/6 bg-[#3A2BE8] text-white font-semibold mt-5']")
    private WebElement btnJadwalStudent;
    public String dir = System.getProperty("user.dir");
    public void clickEditProfileStu(){
        btnEditProfileStu.click();
    }
    public boolean verifyLandingEditProfileStuPage(){
        return namaLengkapField.isDisplayed();
    }
    public void setNameUpdate(String nameUpdate){
        namaLengkapField.clear();
        namaLengkapField.sendKeys(nameUpdate);
    }
    public void setSelectJenisKelamin(String jenisKelamin){
        Select a = new Select(selectJenisKelamin);
        a.selectByVisibleText(jenisKelamin);
    }
    public void setPhoneUpdate(String phoneUpdate){
        noHpField.clear();
        noHpField.sendKeys(phoneUpdate);
    }
    public void setEmailUpdate(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void setAddressUpdate(String addressUpdate){
        addressField.clear();
        addressField.sendKeys(addressUpdate);
    }
    public void editPhotoProfileStu(){
        btnChooseFile.sendKeys(dir+"/DocFoto/Foto-John.jpg");
    }
    public void clickBtnUpdateStu(){
        btnUpdate.click();
    }
    public void setOldPassUpdate(String oldPass){
        oldPasswordField.clear();
        oldPasswordField.sendKeys(oldPass);
        showPassword.click();
    }
    public void setNewPassUpdate(String newPass){
        newPasswordField.clear();
        newPasswordField.sendKeys(newPass);
        showPassword.click();
    }
    public void setConfirmPassUpdate(String confirmPass){
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPass);
        showPassword.click();
    }
    public void clickBtnUpdatePasswordStu(){
        btnUpdatePassword.click();
    }
    public void clickBtnKembaliStu(){
        btnKembali.click();
    }
    public boolean backToProfileStudentPage(){
        return btnJadwalStudent.isDisplayed();
    }
}
