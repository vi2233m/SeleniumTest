package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestBaseRunner {

    public static WebDriver driver;

//    public WebDriver getDriver() {
//        return driver;
//    }

    @BeforeClass
    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        //启动浏览器，最大化窗口
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS); //隐式等待6s

        driver.get("https://172.16.3.207:1181/Manage/index.php?s=/Public/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("rebecca", "888").gotoWareHousePage();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
