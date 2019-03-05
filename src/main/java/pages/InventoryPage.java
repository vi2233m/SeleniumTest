package pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage extends MainnavPage{
    public WebDriver driver;
    public InventoryPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

//    public SkuPage gotoSkuPage(){
//        super.gotoSkuPage();
//        return new SkuPage(driver);
//    }
}
