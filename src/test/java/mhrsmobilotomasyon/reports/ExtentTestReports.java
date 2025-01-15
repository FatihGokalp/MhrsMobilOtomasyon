package mhrsmobilotomasyon.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestReports {

    public static ExtentReports extent = new ExtentReports();

    public static void  beforeTest(){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("MhrsMobilOtomasyon/mobilReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void  afterTest(){
        extent.flush();
    }
}
