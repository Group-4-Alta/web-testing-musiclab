package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TambahLiatJadwalMentorPage {
    public static WebDriver driver;

    public TambahLiatJadwalMentorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//summary[.='Tambah Jadwal']")
    private WebElement tambahJadwal;

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement pilihHari;

    @FindBy (xpath = "//input[@id='input-startTime']")
    private WebElement startHour;

    @FindBy (xpath = "//input[@id='input-endTime']")
    private WebElement endHour;

    @FindBy (xpath = "//button[@id='btn-jadwal']")
    private WebElement btnUploadJadwal;

    @FindBy(xpath = "//summary[.='Lihat Jadwal']")
    private WebElement lihatJadwal;

    @FindBy(xpath = "//div[@class='w-[14rem] p-3']/div[4]//button[@id='btn-delete']")
    private WebElement btnX;

    public void setTambahJadwal(){
        tambahJadwal.click();
    }
    public void setPilihHari(String hari){
        Select a = new Select(pilihHari);
        pilihHari.click();
        a.selectByVisibleText(hari);
    }

    public void setStartHour(int hourstart){
        startHour.sendKeys(String.valueOf(hourstart));
    }
    public void setEndHour(int hourend){
        endHour.sendKeys(String.valueOf(hourend));
    }
    public void clickUploadJadwal(){
        btnUploadJadwal.click();
    }
    public void clickLihatJadwal(){
        lihatJadwal.click();
    }

    public void clickbtnX(){
        btnX.click();
    }
}
