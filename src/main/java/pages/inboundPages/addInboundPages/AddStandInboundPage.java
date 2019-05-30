package pages.inboundPages.addInboundPages;

import datas.inbound.InboundAddData;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import org.testng.Reporter;
import pages.inboundPages.AddInboundPage;
import pages.inboundPages.AllInboundPage;
import utils.WaitElement;

public class AddStandInboundPage extends AddInboundPage {

    private WebDriver driver;
    public AddStandInboundPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //基本信息 第1步
    @FindBy(id = "J_WinitProduct")
    WebElement WINIT产品;
    @FindBy(id = "customerOrderNo")
    WebElement 客户订单号;
    @FindBy(id = "inspectionWH")
    WebElement 验货仓;
    @FindBy(id = "destinationWH")
    WebElement 目的仓;
    @FindBy(id = "stepOneContinue")
    WebElement 继续01;
    //商品信息 第2步
    @FindBy(id = "importFile")
    WebElement 选择文件;
    @FindBy(id = "uploadSubmit")
    WebElement 导入;
    @FindBy(id = "addOnePackage")
    WebElement 逐个添加;
    @FindBy(xpath = "//input[@name='caseNo']")
    WebElement 箱号;
    @FindBy(xpath = "//input[@name='packageWeight']")
    WebElement packageWeight;
    @FindBy(xpath = "//input[@name='packageLength']")
    WebElement packageLength;
    @FindBy(xpath = "//input[@name='packageWidth']")
    WebElement packageWidth;
    @FindBy(xpath = "//input[@name='packageHeight']")
    WebElement packageHeight;
    @FindBy(xpath = "//input[@id='productList']")
    WebElement 商品编码;
    @FindBy(xpath = "//div[@class='xdsoft_autocomplete_dropdown']/div[1]")
    WebElement dropdown;
    @FindBy(xpath = "//input[@name='quantity[]']")
    WebElement 数量;
    @FindBy(xpath = "//button[contains(text(),'新增下一个')]")
    WebElement 新增下一个;
    @FindBy(xpath = "//a[@id='addPackage']")
    WebElement 新增包裹;
    @FindBy(xpath = "//button[contains(text(),'确定')]")
    WebElement 确定;
    @FindBy(xpath = "//button[@id='stepTwoSave']")
    WebElement 保存到草稿02;
    @FindBy(xpath = "//button[@id='stepTwoContinue']")
    WebElement 继续02;
    //跨国物流信息  第3步
    @FindBy(xpath = "//div[@id='select_logisticsPlanNo']")
    WebElement 物流计划;
    @FindBy(xpath = "//ul[@id='options_logisticsPlanNo']/li[2]")
    WebElement 物流计划选择;
    @FindBy(xpath = "//select[@id='exporterCode']")
    WebElement 出口商;
    @FindBy(xpath = "//select[@id='importRules']")
    WebElement 进口报关规则;
    @FindBy(xpath = "//button[@id='stepThreeSave']")
    WebElement 保存到草稿03;
    @FindBy(xpath = "//button[@id='stepThreeContinue']")
    WebElement 继续03;
    //验货/提货信息 第4步
    @FindBy(xpath = "//select[@id='inspectionType']")
    WebElement 验货方式;
    @FindBy(xpath = "//select[@id='pickupType']")
    WebElement 提货类型;
    @FindBy(xpath = "//select[@id='pickupTime']")
    WebElement 提货时间;
    @FindBy(xpath = "//select[@id='supplier']")
    WebElement 发货供应商;
    @FindBy(xpath = "//input[@id='expressNo']")
    WebElement 快递单号;
    @FindBy(xpath = "//button[@id='stepFourSave']")
    WebElement 保存到草稿04;
    @FindBy(xpath = "//button[@id='stepFourContinue']")
    WebElement 继续04;
    //费用预估 第5步
    @FindBy(xpath = "//button[@id='submitBtn']")
    WebElement 提交;

    /**
     *  标准入库下单 第一步
     *  @param data
     */
    @Step("标准入库下单 第一步")
    public AddStandInboundPage stepOne (InboundAddData data) throws Exception {
        Allure.attachment("验货仓:",data.getInspectionWH());
        Allure.attachment("目的仓:",data.getDestinationWH());
        Allure.attachment("WINIT产品",data.getProduct());
        Allure.attachment("客户订单号",data.getCustomerOrderNo());
        new Select(WINIT产品).selectByValue(data.getProduct());
        客户订单号.sendKeys(data.getCustomerOrderNo());
        new Select(验货仓).selectByValue(data.getInspectionWH());
        Thread.sleep(1000);
        new Select(目的仓).selectByValue(data.getDestinationWH());
        Thread.sleep(1000);
//        new WaitElement(driver, 继续01);
        继续01.click();
        return new AddStandInboundPage(driver);
    }

    /**
     * 标准入库下单 第二步
     * @param data
     * @return
     */
    @Step("标准入库下单 第二步")
    public AddStandInboundPage stepTwo(InboundAddData data, int packageNum, int skuNum) throws Exception {
        Allure.attachment("箱号:",data.getCaseNo());
        Allure.attachment("packageWeight:",data.getWeight());
        Allure.attachment("packageLength",data.getLength());
        Allure.attachment("packageWidth",data.getWidth());
        Allure.attachment("sendKeys",data.getHeight());
        Allure.attachment("商品编码",data.getSkuCode());
        逐个添加.click();
        for( int i=0; i< packageNum; i ++) {
            if(i != 0){
                新增包裹.click(); //如果包裹数不止1 个的话，需要点新增包裹
            }
            String caseNo =(long)(1 + Math.random() * 100000000)+"";
            箱号.sendKeys(caseNo);
            packageWeight.sendKeys(data.getWeight());
            packageLength.sendKeys(data.getLength());
            packageWidth.sendKeys(data.getWidth());
            packageHeight.sendKeys(data.getHeight());
            商品编码.sendKeys(data.getSkuCode());
//        Thread.sleep(2000);
            By test1 = By.xpath("//div[@class='xdsoft_autocomplete_dropdown']/div");
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(test1));
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).perform();
            数量.clear();
            数量.sendKeys(skuNum +"");
            确定.click();
            Thread.sleep(3000);
        }
        继续02.click();
        return new AddStandInboundPage(driver);
    }

    /**
     * 标准入库下单 第三步
     * @param data
     * @return
     */
    @Step("标准入库下单 第三步")
    public AddStandInboundPage stepThree(InboundAddData data) throws Exception {
        Reporter.log("出口商" + data.getExporterCode());
        Thread.sleep(2000);
        物流计划.click();
        Thread.sleep(2000);
        物流计划选择.click();
        new Select(出口商).selectByValue(data.getExporterCode());
        Thread.sleep(1000);
        new Select(进口报关规则).selectByValue(data.getImportRules());
        Thread.sleep(1000);
        继续03.click();
        return new AddStandInboundPage(driver);
    }

    /**
     * 标准入库下单 第四步
     * @param data
     * @return
     */
    @Step("标准入库下单 第四步")
    @Description
    public AddStandInboundPage stepFour(InboundAddData data) throws Exception {
        Thread.sleep(1000);
        new Select(验货方式).selectByValue(data.getInspectionType());
        Thread.sleep(1000);
        new Select(提货类型).selectByValue(data.getPickupType());
        Thread.sleep(1000);
        new Select(发货供应商).selectByValue(data.getSupplier());
        快递单号.sendKeys(data.getExpressNo());
        继续04.click();
        return new AddStandInboundPage(driver);
    }

    /**
     * 标准入库下单提交 第五步
     * @return
     * @throws InterruptedException
     */
    @Step("标准入库下单提交 第五步")
    @Description
    public AllInboundPage stepFive() throws InterruptedException {
        Thread.sleep(2000);
        提交.click();
        return new AllInboundPage();
    }

}
