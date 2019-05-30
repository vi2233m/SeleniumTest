package com.demo;

import datas.inbound.InboundAddData;
import io.qameta.allure.Issue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import pages.inboundPages.InboundPage;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import utils.TestBaseRunner;
import utils.TestFailListener;


@Listeners(TestFailListener.class)
public class TestDemo extends TestBaseRunner {
//    private static WebDriver driver;
//
//    @BeforeClass
//    public void setUp(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--start-maximized");
//        //启动浏览器，最大化窗口
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS); //隐式等待6s
//    }

    @DataProvider
    public Object[][] getData(){
        Object[][] objects = {
                {"123456","654321"}
        };
        return objects;
    }

    @Test(dataProvider = "getData")
    @Issue("dadfd")
    @TestCaseId("34233")
    public void test(String customNo, String caseNo) throws Exception{

//        driver.get("https://172.16.3.207:1181/Manage/index.php?s=/Public/login");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("rebecca", "888").gotoWareHousePage();

        InboundPage inboundPage = new InboundPage(driver);
        InboundAddData inboundAddData = new InboundAddData();
        inboundAddData.setCaseNo(caseNo);
        inboundAddData.setCustomerOrderNo(customNo);
        inboundPage
                .gotoAddInboundPage()
                .gotoAddStandInboundPage()
                .stepOne(inboundAddData)
                .stepTwo(inboundAddData,5,5)
                .stepThree(inboundAddData)
                .stepFour(inboundAddData)
                .stepFive();

        Thread.sleep(5000);

//        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
//        webDriverWait.until()

    }

//    @AfterClass
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }
}
