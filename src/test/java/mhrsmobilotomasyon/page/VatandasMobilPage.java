package mhrsmobilotomasyon.page;

import io.appium.java_client.AppiumDriver;
import mhrsmobilotomasyon.base.BasePage;
import mhrsmobilotomasyon.constants.Constants;

import static mhrsmobilotomasyon.constants.Constants.*;

public class VatandasMobilPage extends BasePage {

    AppiumDriver driver;

    public VatandasMobilPage(AppiumDriver driver) {
        super(driver);
    }

    // 1. case uygulama açılır ve ana sayfadaki mhrs logo kontrol edilir.
    public  VatandasMobilPage loginSayfasi() {
        isEnabled(mhrsLoginLogoId);
        infoLog("Uygulama Açıldı. Mhrs Logo kontrolü yapıldı.");
        return this;
    }

    // 2. case tckn ve sifre alanlarına veri girişi yapılır
    public  VatandasMobilPage loginTcSifreGirisi() {
        sendKeys(mhrsLoginTc,"54367264940");
        sendKeys(mhrsloginParola,"Aa123456.");
        passLog("Tckn ve sifre girilir.");
        failLog("Tckn ve sifre hatalı girildi. 2. case");
        return this;
    }

    //3. case login butonuna tiklama
    public  VatandasMobilPage loginOlma() {
        click(mhrsLoginButton);
        passLog("Login butonuna tiklanir.");
        failLog("Tckn ve sifre hatalı girildi. 3. case");
        return this;
    }

    //4.case
    public VatandasMobilPage neyimVarPopUpKontrol() {
        isEnabled(mhrsAnasayfaYonlendirmeButon);
        passLog("Neyimvar Pop-up kontrol.");
        failLog("Neyimvar Pop-up başarısız");
        return this;
    }

    //5.case
    public VatandasMobilPage neyimvarAnasayfaYonlendirme(){
        click(mhrsAnasayfaYonlendirmeButon);
        passLog("Anasayfaya başarılı şekilde yönlendirildi.");
        failLog("Anasayfaya yönelndirme başarısız");
        return this;
    }

    //6.case
    public VatandasMobilPage anasayfaMhrsLogoKontrol(){
        isEnabled(mhrsAnasayfaMhrsLogo);
        passLog("Anasayfa basarili şekilde acildi.");
        failLog("Anasayfa acilamadi");
        return this;
    }
}
