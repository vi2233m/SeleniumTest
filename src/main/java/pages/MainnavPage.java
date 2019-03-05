package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * 首页导航页
 */
public abstract class MainnavPage {
//    private T SidenanElement;
    private WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'首页')]/..")
    WebElement homeElement;
    @FindBy(xpath = "//span[contains(text(),'商品')]/..")
    WebElement skuElement;
    @FindBy(xpath = "//span[contains(text(),'库存')]/..")
    WebElement inventoryElement;
    @FindBy(xpath = "//span[contains(text(),'海外仓')]/..")
    WebElement warehouseElement;
    @FindBy(xpath = "//span[contains(text(),'国际送仓')]/..")
    WebElement globalTransferElement;
    @FindBy(xpath = "//span[contains(text(),'ISP')]/..")
    WebElement ispElement;
    @FindBy(xpath = "//span[contains(text(),'平台同步')]/..")
    WebElement orderSyncElement;
    @FindBy(xpath = "//span[contains(text(),'退货')]/..")
    WebElement retrunElement;
    @FindBy(xpath = "//span[contains(text(),'索赔/查件')]/..")
    WebElement claimCheckElement;
    @FindBy(xpath = "//span[contains(text(),'我的钱包')]/..")
    WebElement walletElement;
    @FindBy(xpath = "//span[contains(text(),'个人中心')]/..")
    WebElement myCenterElement;
//    @FindBy(xpath = "//ul[@class='mainnav']/li/a/span")
//    List<WebElement> mainnavElenment;

    public MainnavPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

//    public T gotoSidenanElement(String text){
//        for (WebElement e : mainnavElenment){
//            if (e.getText() == text){
//                e.click();
//                System.out.println("-----------"+e.getText());
//                break;
//            }
//        }
//        return (T) this;
//    }



    /**
     * 点击首页页签
     * @return
     */
    public HomePage gotoHomePage(){
        homeElement.click();
        return new HomePage(driver);
    }

    /**
     * 点击商品页签
     * @return
     */
    public SkuPage gotoSkuPage(){
        skuElement.click();
        return new SkuPage(driver);
    }

    /**
     * 点击库存页签
     * @return
     */
    public InventoryPage gotoInbentoryPage(){
        inventoryElement.click();
        return new InventoryPage(driver);
    }

    /**
     * 点击海外仓页签
     * @return
     */
    public WareHousePage gotoWareHousePage(){
        warehouseElement.click();
        return new WareHousePage(driver);
    }

}
