package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditProfileMentorPage {

    public static WebDriver driver;

    public EditProfileMentorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//button[@id='btn-editTeacher']")
    private WebElement btnEditProfileMentor;
    @FindBy (xpath = "//h1[@class='text-black font-bold font-poppins text-2xl text-center']")
    private WebElement verifyeditprofilementorpage;
    @FindBy (xpath = "//input[@class='input input-bordered w-10/12 lg:w-9/12 bg-bg-input border-slate-300 text-black font-semibold font-poppins bg-white']")
    private WebElement fieldNama;
    @FindBy (xpath = "//textarea[@id='input-deskripsi']")
    private WebElement fieldDeskripsi;
    @FindBy (xpath = "//select[@id='select-jeniskelamin']")
    private WebElement selectJenisKelamin;
    @FindBy (xpath = "//input[@id='input-telepon']")
    private WebElement fieldNoHP;
    @FindBy (xpath = "//input[@id='input-email']")
    private WebElement fieldEmail;
    @FindBy (xpath = "//input[@id='input-socialmedia-instagram']")
    private WebElement fieldInstagram;
    @FindBy (xpath = "//textarea[@id='input-address']")
    private WebElement fieldAlamat;
    @FindBy (xpath = "//button[@id='btn-Update']")
    private WebElement btnUpdate;
    @FindBy (xpath = "//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-5 border-none']")
    private WebElement btnChooseFilePP;
    @FindBy (xpath = "//select[@id='select-role']")
    private WebElement selectTipeSertifikat;
    @FindBy (xpath = "//input[@class='input input-bordered   border-slate-300  w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto  text-black font-semibold font-poppins']")
    private WebElement fieldNamaSertifikat;
    @FindBy (xpath = "//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-10 border-none']")
    private WebElement btnChooseSertifikat;
    @FindBy (xpath = "//button[@id='btn-uploadsertifikat']")
    private WebElement btnUploadSertifikat;
    @FindBy (xpath = "//select[2]")
    private WebElement selectInstrument;
    @FindBy (xpath = "//button[@id='btn-submitinstrument']")
    private WebElement btnInstrument;
    @FindBy (xpath = "//select[3]")
    private WebElement selectGenre;
    @FindBy (xpath = "//button[.='Update Genres']")
    private WebElement btnGenre;
    @FindBy (xpath = "//input[@id='input-oldpassword']")
    private WebElement inputOldPass;
    @FindBy (xpath = "//input[@id='input-newpassword']")
    private WebElement inputNewPass;
    @FindBy (xpath = "//input[@id='input-confirmpassword']")
    private WebElement inputConfirmPass;
    @FindBy (xpath = "//button[.='Update Password']")
    private WebElement btnUpdatePass;
    @FindBy (xpath = "//button[@id='btn-back']")
    private WebElement btnKembali;
    public static String dir = System.getProperty("user.dir");

    public void clickBtnEditProfileMentor () {
        btnEditProfileMentor.click();
    }

    public boolean verifyEditProfileMentorPage () {
        return verifyeditprofilementorpage.isDisplayed();
    }

    public void setFieldNama (String nama) {
        fieldNama.clear();
        fieldNama.sendKeys(nama);
    }

    public void setFieldDeskripsi (String deskripsi) {
        fieldDeskripsi.clear();
        fieldDeskripsi.sendKeys(deskripsi);
    }

    public void setSelectJenisKelamin (String jenisKelamin) {
        Select a = new Select(selectJenisKelamin);
        a.selectByVisibleText(jenisKelamin);
    }

    public void setFieldNoHP (String noHP) {
        fieldNoHP.clear();
        fieldNoHP.sendKeys(noHP);
    }

    public void setFieldEmail (String email) {
        fieldEmail.clear();
        fieldEmail.sendKeys(email);
    }

    public void setFieldInstagram (String instagram) {
        fieldInstagram.clear();
        fieldInstagram.sendKeys(instagram);
    }

    public void setFieldAlamat (String alamat) {
        fieldAlamat.clear();
        fieldAlamat.sendKeys(alamat);
    }

    public void clickBtnUpdate () {
        btnUpdate.click();
    }

    public void clearAllField () {
        fieldNama.clear();
        fieldDeskripsi.clear();
        fieldNoHP.clear();
        fieldEmail.clear();
        fieldInstagram.clear();
        fieldAlamat.clear();
    }

    public void uploadPPMentor () {
        btnChooseFilePP.sendKeys(dir+"/DocFoto/budicoba.jpg");
    }

    public void uploadPPMentorInvalid () {
        btnChooseFilePP.sendKeys(dir+"/DocFoto/PPinvalid.txt");
    }

    public void setSelectTipeSertifikat (String tipecerti) {
        Select a = new Select(selectTipeSertifikat);
        a.selectByVisibleText(tipecerti);
    }

    public void setFieldNamaSertifikat (String sertifikat) {
        fieldNamaSertifikat.clear();
        fieldNamaSertifikat.sendKeys(sertifikat);
    }

    public void uploadSertifikatValid () {
        btnChooseSertifikat.sendKeys(dir+"/DocFoto/mgm-certi.jpg");
    }

    public void uploadSertifikatInvalid () {
        btnChooseSertifikat.sendKeys(dir+"/DocFoto/mgm-logo.jpg");
    }

    public void clickBtnUploadSertifikat () {
        btnUploadSertifikat.click();
    }

    public void setSelectInstrument (String instrument) {
        Select a = new Select(selectInstrument);
        a.selectByVisibleText(instrument);
    }

    public void clickUpdateInstrument () {
        btnInstrument.click();
    }

    public void setSelectGenre (String genre) {
        Select a = new Select(selectGenre);
        a.selectByVisibleText(genre);
    }

    public void clickUpdateGenre () {
        btnGenre.click();
    }

    public void setInputPass (String oldpass, String newpass, String confirmpass) {
        inputOldPass.sendKeys(oldpass);
        inputNewPass.sendKeys(newpass);
        inputConfirmPass.sendKeys(confirmpass);
    }

    public void clickUpdatePass () {
        btnUpdatePass.click();
    }

    public void clickBtnKembali () {
        btnKembali.click();
    }
}
