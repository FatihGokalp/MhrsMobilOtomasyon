package mhrsmobilotomasyon;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginTest {

    public AppiumDriver driver;

    public WebDriverWait wait;

    By mhrsLoginLogoId = By.id("tr.gov.saglik.MHRSMOBIL:id/mhrsLogo");
    By mhrsLoginTc = By.id("tr.gov.saglik.MHRSMOBIL:id/edtTcNo");
    By mhrsloginParola = By.id("tr.gov.saglik.MHRSMOBIL:id/edtPass");



    @BeforeTest
    public void beforeTest() {
         try{
             DesiredCapabilities cap;
             cap = new DesiredCapabilities();

             cap.setCapability("deviceName","Emulator");
             cap.setCapability("platformName","Android");
             cap.setCapability("platformVersion","12.0");
             cap.setCapability("udid","emulator-5554");
             cap.setCapability("appPackage","tr.gov.saglik.MHRSMOBIL");
             cap.setCapability("appActivity","tr.gov.msrs.ui.activity.login.LoginActivity");
             cap.setCapability("skipUnlock","true");
             cap.setCapability("noReset","true");

             driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
             wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         }
         catch(MalformedURLException mx){
             System.out.println("Hatalı oluşturulmuş URL istisnası!!");
         }

    }
    @Test
    public void test() {



        WebElement mhrsLoginLogo = driver.findElement(mhrsLoginLogoId);
        mhrsLoginLogo.isSelected();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(mhrsLoginTc).sendKeys("54367264940");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(mhrsloginParola).sendKeys("Aa123456.");

    }


    @AfterTest
    public void tearDown() {

    }
}


