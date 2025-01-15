package mhrsmobilotomasyon.base;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import mhrsmobilotomasyon.reports.ExtentTestReports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends ExtentTestReports {

    AppiumDriver driver;
    WebDriverWait wait;

    public ExtentTest starTest = extent.createTest("MHRS Mobil Test","Login Olma");

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String value){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).sendKeys(value);
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void clear(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).clear();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return findElement(by).getText();
    }

    public boolean isEnabled(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return findElement(by).isEnabled();
    }

    public void infoLog(String str){
        starTest.log(Status.INFO,str);
    }
    public void passLog(String str){
        starTest.log(Status.PASS,str);
    }
    public void failLog(String str){
        starTest.log(Status.FAIL,str);
    }
    public void errorLog(String str){
        starTest.log(Status.ERROR,str);
    }





}
