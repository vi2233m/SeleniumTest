package pages.outboundPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WareHousePage;

public class OutboundPage extends WareHousePage {

    private WebDriver driver;
    public OutboundPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//li/a[contains(text(),'全部订单')][contains(@href,'WHOutbound')]")
    WebElement allOutbound;
    @FindBy(xpath = "//li/a[contains(text(),'未提交订单')][contains(@href,'WHOutbound')]")
    WebElement draftOutbound;
    @FindBy(xpath = "//li/a[contains(text(),'新增出库单')]")
    WebElement addOutbound;
    @FindBy(xpath = "//li/a[contains(text(),'批量上传')][contains(@href,'WHOutbound')]")
    WebElement batchAddOutbound;

    /**
     * 全部订单
     * @return
     */
    public AllOutboundPage gotoAllOutboundPage(){
        allOutbound.click();
        return new AllOutboundPage();
    }

    /**
     * 未提交订单
     * @return
     */
    public DraftOutboundPage gotoDraftOutboundPage(){
        draftOutbound.click();
        return new DraftOutboundPage();
    }

    /**
     * 新增出库单
     * @return
     */
    public AddOutboundPage gotoAddOutboundPage(){
        addOutbound.click();
        return new AddOutboundPage();
    }

    /**
     * 批量上传
     * @return
     */
    public BatchAddOutboundPage gotoBatchAddOutboundPage(){
        batchAddOutbound.click();
        return new BatchAddOutboundPage();
    }

}
