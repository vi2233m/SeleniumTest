package pages.inboundPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WareHousePage;

/**
 *  海外仓默认页面，初始页面
 */
public class InboundPage extends WareHousePage {

    private WebDriver driver;

    public InboundPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//li/a[contains(text(),'全部订单')][contains(@href,'WHInbound')]")
    WebElement allInbound;
    @FindBy(xpath = "//li/a[contains(text(),'新增入库单')]")
    WebElement addInbound;
    @FindBy(xpath = "//li/a[contains(text(),'草稿订单')]")
    WebElement draftInbound;

    /**
     * 新增入库单
     * @return
     */
    public AddInboundPage gotoAddInboundPage(){
        addInbound.click();
        return new AddInboundPage(driver);
    }

    /**
     * 全部订单
     * @return
     */
    public AllInboundPage gotoAllInboundPage(){
        allInbound.click();
        return new AllInboundPage();
    }

    /**
     * 草稿订单
     * @return
     */
    public DraftInboundPage gotoDraftInboundPage(){
        draftInbound.click();
        return new DraftInboundPage();
    }

}
