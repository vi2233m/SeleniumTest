package pages.inboundPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.inboundPages.addInboundPages.AddHomeInsInboundPage;
import pages.inboundPages.addInboundPages.AddOverseasInsInboundPage;
import pages.inboundPages.addInboundPages.AddStandInboundPage;

public class AddInboundPage extends InboundPage{

    private WebDriver driver;
    public AddInboundPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //发货仓
    @FindBy(xpath = "//a[text()='标准海外仓入库']")
    WebElement 标准海外仓入库;
    @FindBy(xpath = "//li[@data-target='#createOrderDI']/a[contains(text(),'直发国内验入库')]")
    WebElement 直发国内验入库;
    @FindBy(xpath = "//a[contains(text(),'直发海外验入库')]")
    WebElement 直发海外验入库;
    //智能分仓
    @FindBy(xpath = "//a[contains(text(),'智能-标准海外仓入库')]")
    WebElement 智能_标准海外仓入库;
    @FindBy(xpath = "//a[contains(text(),'智能-直发国内验入库')]")
    WebElement 智能_直发国内验入库;
    //存储仓
    @FindBy(xpath = "//a[contains(text(),'标准存储仓入库')]")
    WebElement 标准存储仓入库;
    @FindBy(xpath = "//a[contains(text(),'直发存储仓入库')]")
    WebElement 直发存储仓入库;

    /**
     * 标准海外仓入库
     * @return
     */
    public AddStandInboundPage gotoAddStandInboundPage(){
        标准海外仓入库.click();
        return new AddStandInboundPage(driver);
    }

    /**
     * 直发国内验入库
     * @return
     */
    public AddHomeInsInboundPage gotoAddHomeInsInboundPage(){
        直发国内验入库.click();
        return new AddHomeInsInboundPage();
    }

    /**
     * 直发海外验入库
     * @return
     */
    public AddOverseasInsInboundPage gotoAddOverseasInsInboundPage(){
        直发海外验入库.click();
        return new AddOverseasInsInboundPage();
    }
}
