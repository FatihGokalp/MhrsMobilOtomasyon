package mhrsmobilotomasyon.test;

import mhrsmobilotomasyon.base.BaseTest;
import mhrsmobilotomasyon.page.VatandasMobilPage;
import mhrsmobilotomasyon.reports.ExtentTestReports;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    VatandasMobilPage vatandasMobilPage;

    @BeforeSuite
    public void setupSuite() {
        ExtentTestReports.afterTest();
    }

    @AfterSuite
    public void afterSuite() {
        ExtentTestReports.beforeTest();
    }

    @BeforeClass
    public void before() {
        vatandasMobilPage = new VatandasMobilPage(getAppiumDriver());
    }

    @Test
    public void testLogin() throws InterruptedException {
        vatandasMobilPage
                .loginSayfasi() //1.case
                .loginTcSifreGirisi()//2.case
                .loginOlma();//3

        Thread.sleep(5000);
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
