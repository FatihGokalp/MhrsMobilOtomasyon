package mhrsmobilotomasyon.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mhrsmobilotomasyon.reports.ExtentTestReports;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest extends ExtentTestReports {

    static AppiumDriver appiumDriver = null;

    public static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
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

            appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
        }
        catch(MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL istisnası!!");
        }
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }
    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTest.appiumDriver = appiumDriver;
    }

    @AfterClass
     public void tearDown() {
        getAppiumDriver().quit();
     }




}
