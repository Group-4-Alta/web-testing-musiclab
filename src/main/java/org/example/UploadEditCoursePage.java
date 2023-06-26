package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UploadEditCoursePage {
    public static WebDriver driver;

    public UploadEditCoursePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-kursussaya']")
    private WebElement btnKursusSaya;

    @FindBy(xpath = "//button[@id='btn-uploadnewcourse']")
    private WebElement btnUploadNewCourse;

    @FindBy(xpath = "//h1[@class='text-black font-bold w-9/12 flex justify-center text-2xl font-poppins lg:mt-0 -mt-8']")
    private WebElement uploadKursusPage;

    @FindBy(xpath = "//input[@id='input-header-kursus']")
    private WebElement btnChooseFile;

    @FindBy(xpath = "//input[@id='input-harga-kursus']")
    private WebElement hargaKhususField;

    @FindBy(xpath = "//input[@id='input-duratopn']")
    private WebElement durationField;

    @FindBy(xpath = "//input[@id='input-judulkursus']")
    private WebElement judulKhursusField;

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectRoleLevel;

    @FindBy(xpath = "//textarea[@id='input-deskripsikursus']")
    private WebElement deskripsiKhususField;

    @FindBy(xpath = "//textarea[@id='input-apayangdipelajari']")
    private WebElement apaYangDipelajariField;

    @FindBy(xpath = "//textarea[@id='input-prasayrat-khusus']")
    private WebElement prasyaratKhususField;

    @FindBy(xpath = "//textarea[@id='input-untuk-siapa-kursus-ini']")
    private WebElement untukSiapaKhursusIniField;

    @FindBy(xpath = "//button[@id='btn-uploadkursus']")
    private WebElement btnUploadKursus;

    @FindBy(xpath = "//button[@id='btn-kembali']")
    private WebElement btnCancel;

    @FindBy(xpath = "//button[@id='btn-updatekursus']")
    private WebElement btnUpdateKursus;

    @FindBy(xpath = "//div[@class='grid grid-flow-row auto-rows-max grid-cols-2 gap-8 md:grid-cols-4 lg:grid-cols-4']/div[1]//button[@id='btn-edit']")
    private WebElement btnEditCourse;

    public String dir = System.getProperty("user.dir");

    public void clickKursusSaya(){
        btnKursusSaya.click();
    }
    public boolean coursePage(){
        return btnUploadNewCourse.isDisplayed();
    }
    public void clickUploadKNewCourse(){
        btnUploadNewCourse.click();
    }

    public void clickBtnUpdateKursus(){
        btnUpdateKursus.click();
    }

    public void clickBtnEditCourse(){
        btnEditCourse.click();
    }

    public boolean verifyUploadKursusPage(){
        return uploadKursusPage.isDisplayed();
    }

    public void uploadPhotoProfile(){
        btnChooseFile.sendKeys(dir+"/foto/10.png");
    }

    public void setJudulKhursusField(String judul){
        judulKhursusField.clear();
        judulKhursusField.sendKeys(judul);
    }
    public void setSelectRoleLevel(String role){
        Select a = new Select(selectRoleLevel);
        selectRoleLevel.click();
        a.selectByVisibleText(role);
    }
    public void setDeskripsiKhususField(String deskripsi){
        deskripsiKhususField.clear();
        deskripsiKhususField.sendKeys(deskripsi);
    }

    public void setApaYangDipelajariField(String dipelajari) {
        apaYangDipelajariField.clear();
        apaYangDipelajariField.sendKeys(dipelajari);
    }
    public void setPrasyaratKhususField(String prasyarat){
        prasyaratKhususField.clear();
        prasyaratKhususField.sendKeys(prasyarat);
    }

    public void setUntukSiapaKhursusIniField(String untukSiapa){
        untukSiapaKhursusIniField.clear();
        untukSiapaKhursusIniField.sendKeys(untukSiapa);
    }

    public void setHargaKhususField(int harga){
        hargaKhususField.clear();
        hargaKhususField.sendKeys(String.valueOf(harga));
    }

    public void setEmptyHargaKhususField() {
        hargaKhususField.clear();
    }

    public void setDurationField(int duration){
        durationField.clear();
        durationField.sendKeys(String.valueOf(duration));
    }
    public void clickBtnUploadKursus(){
        btnUploadKursus.click();
    }

    public void clickBtnCancel(){
        btnCancel.click();
    }
}
