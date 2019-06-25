package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {

//    public WaitElement(WebDriver driver, WebElement element){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

    /**
     *  WaitElementForClick
     * @param element 元素
     * @param times 等待时间（s）
     * @throws InterruptedException
     */
    public WaitElement(WebElement element, int times) throws InterruptedException {
        for (int i = 0; i < times; i++){
            try {
                element.click();
                break;
            }catch (Exception e){
                e.printStackTrace();
                Thread.sleep(1000);
            }
        }
    }

    /**
     *  WaitElementForSelect
     * @param element 元素
     * @param value 元素Value
     * @param times 等待时间（s）
     * @throws InterruptedException
     */
    public WaitElement(WebElement element, String value, int times) throws InterruptedException {
        //// TODO: 2019/6/25 适配除了通过value查找，还能通过text 等其他内容查找
        for (int i = 0; i < times; i ++){
            try {
                new Select(element).selectByValue(value);
                break;
            }catch (Exception e){
                e.printStackTrace();
                Thread.sleep(1000);
                new Select(element).selectByValue(value);
            }
        }
    }
}
