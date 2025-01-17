package mhrsmobilotomasyon.test;

import mhrsmobilotomasyon.base.BaseTest;
import mhrsmobilotomasyon.page.VatandasMobilPage;
import mhrsmobilotomasyon.reports.ExtentTestReports;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    VatandasMobilPage vatandasMobilPage;

    @BeforeSuite
    public void setupSuite() {
        ExtentTestReports.beforeTest();
    }

    @AfterSuite
    public void afterSuite() {
        ExtentTestReports.afterTest();
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
                .loginOlma()//3.case
                .neyimVarPopUpKontrol()//4.case
                .neyimvarAnasayfaYonlendirme()//5.case
                .anasayfaMhrsLogoKontrol();//6.case
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
