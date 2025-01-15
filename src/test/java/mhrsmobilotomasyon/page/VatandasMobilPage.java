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
        sendKeys(mhrsloginParola,"Aa123456");
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
}
