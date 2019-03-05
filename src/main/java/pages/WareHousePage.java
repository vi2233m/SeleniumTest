package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.LmaPages.LmaPage;
import pages.inboundPages.InboundPage;
import pages.outboundPages.OutboundPage;

public class WareHousePage extends MainnavPage{
    public WebDriver driver;

    public WareHousePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    //入库相关
    @FindBy(xpath = "//dt/i[@class='menuIcon PutStorage']")
    WebElement inboundBlack;

    //出库相关
    @FindBy(xpath = "//dt/i[@class='menuIcon Outbound']")
    WebElement outboundBlack;

    //LMA
    @FindBy(xpath = "//dt/i[@class='menuIcon LMA']")
    WebElement lmaBlack;

    /**
     * 展开入库模块
     * @return
     */
    public WareHousePage gotoInboundBlack(){
        inboundBlack.click();
        return new WareHousePage(driver);
    }

    /**
     * 展开出库模块
     * @return
     */
    public WareHousePage gotoOutboundBlack(){
        outboundBlack.click();
        return new WareHousePage(driver);
    }

    /**
     * 展开LMA模块
     * @return
     */
    public WareHousePage gotoLmaBlack(){
        lmaBlack.click();
        return new WareHousePage(driver);
    }

}
