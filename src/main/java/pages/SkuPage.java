package pages;

import org.openqa.selenium.WebDriver;

public class SkuPage extends MainnavPage{

    public WebDriver driver;
    public SkuPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}
