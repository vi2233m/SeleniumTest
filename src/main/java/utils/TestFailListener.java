package utils;


import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.events.TestCaseFailureEvent;
import ru.yandex.qatools.allure.testng.AllureTestListener;
import utils.TestBaseRunner;

public class TestFailListener extends AllureTestListener {

    @Override
    public void onTestFailure(ITestResult result) {
//        TestBaseRunner testBaseRunner = (TestBaseRunner) result.getInstance();
//        WebDriver driver = testBaseRunner.getDriver();
        takePhoto();
    }

    @Attachment(value = "screen shot",type = "image/png")
    public byte[]  takePhoto(){
        byte[] screenshotAs = ((TakesScreenshot)TestBaseRunner.driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }
}
